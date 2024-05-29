package service;



import dao.MealDAO;
import Model.Meal;

import java.sql.SQLException;
import java.util.List;

public class MealService {
    private MealDAO mealDAO;

    public MealService() {
        this.mealDAO = new MealDAO();
    }

    public void addMeal(Meal meal) throws SQLException {
        mealDAO.addMeal(meal);
    }

    public Meal getMeal(int mealID) throws SQLException {
        return mealDAO.getMeal(mealID);
    }

    public List<Meal> getAllMeals() throws SQLException {
        return mealDAO.getAllMeals();
    }

    public void updateMeal(Meal meal) throws SQLException {
        mealDAO.updateMeal(meal);
    }

    public void deleteMeal(int mealID) throws SQLException {
        mealDAO.deleteMeal(mealID);
    }
}

