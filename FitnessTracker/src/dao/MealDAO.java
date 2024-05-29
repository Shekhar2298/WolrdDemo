package dao;

import Model.Meal;
import Utility.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MealDAO {

    public void addMeal(Meal meal) throws SQLException {
        String query = "INSERT INTO Meals (MealType, CaloriesIntake, Date) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, meal.getMealType());
            stmt.setInt(2, meal.getCaloriesIntake());
            stmt.setDate(3, Date.valueOf(meal.getDate()));
            stmt.executeUpdate();
        }
    }

    public Meal getMeal(int mealID) throws SQLException {
        String query = "SELECT * FROM Meals WHERE MealID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, mealID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Meal(
                        rs.getInt("MealID"),
                        rs.getString("MealType"),
                        rs.getInt("CaloriesIntake"),
                        rs.getDate("Date").toLocalDate()
                );
            }
        }
        return null;
    }

    public List<Meal> getAllMeals() throws SQLException {
        List<Meal> meals = new ArrayList<>();
        String query = "SELECT * FROM Meals";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                meals.add(new Meal(
                        rs.getInt("MealID"),
                        rs.getString("MealType"),
                        rs.getInt("CaloriesIntake"),
                        rs.getDate("Date").toLocalDate()
                ));
            }
        }
        return meals;
    }

    public void updateMeal(Meal meal) throws SQLException {
        String query = "UPDATE Meals SET MealType = ?, CaloriesIntake = ?, Date = ? WHERE MealID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, meal.getMealType());
            stmt.setInt(2, meal.getCaloriesIntake());
            stmt.setDate(3, Date.valueOf(meal.getDate()));
            stmt.setInt(4, meal.getMealID());
            stmt.executeUpdate();
        }
    }

    public void deleteMeal(int mealID) throws SQLException {
        String query = "DELETE FROM Meals WHERE MealID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, mealID);
            stmt.executeUpdate();
        }
    }
}

