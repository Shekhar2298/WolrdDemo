package dao;

import Model.Workout;
import Utility.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkoutDAO {

    public void addWorkout(Workout workout) throws SQLException {
        String query = "INSERT INTO Workouts (WorkoutType, Duration, CaloriesBurned, Date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, workout.getWorkoutType());
            stmt.setInt(2, workout.getDuration());
            stmt.setInt(3, workout.getCaloriesBurned());
            stmt.setDate(4, Date.valueOf(workout.getDate()));
            stmt.executeUpdate();
        }
    }

    public Workout getWorkout(int workoutID) throws SQLException {
        String query = "SELECT * FROM Workouts WHERE WorkoutID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, workoutID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Workout(
                        rs.getInt("WorkoutID"),
                        rs.getString("WorkoutType"),
                        rs.getInt("Duration"),
                        rs.getInt("CaloriesBurned"),
                        rs.getDate("Date").toLocalDate()
                );
            }
        }
        return null;
    }

    public List<Workout> getAllWorkouts() throws SQLException {
        List<Workout> workouts = new ArrayList<>();
        String query = "SELECT * FROM Workouts";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                workouts.add(new Workout(
                        rs.getInt("WorkoutID"),
                        rs.getString("WorkoutType"),
                        rs.getInt("Duration"),
                        rs.getInt("CaloriesBurned"),
                        rs.getDate("Date").toLocalDate()
                ));
            }
        }
        return workouts;
    }

    public void updateWorkout(Workout workout) throws SQLException {
        String query = "UPDATE Workouts SET WorkoutType = ?, Duration = ?, CaloriesBurned = ?, Date = ? WHERE WorkoutID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, workout.getWorkoutType());
            stmt.setInt(2, workout.getDuration());
            stmt.setInt(3, workout.getCaloriesBurned());
            stmt.setDate(4, Date.valueOf(workout.getDate()));
            stmt.setInt(5, workout.getWorkoutID());
            stmt.executeUpdate();
        }
    }

    public void deleteWorkout(int workoutID) throws SQLException {
        String query = "DELETE FROM Workouts WHERE WorkoutID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, workoutID);
            stmt.executeUpdate();
        }
    }
}
