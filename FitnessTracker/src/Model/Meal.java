package Model;

import java.time.LocalDate;

public class Meal {
    private int mealID;
    private String mealType;
    private int caloriesIntake;
    private LocalDate date;

    public Meal(int mealID, String mealType, int caloriesIntake, LocalDate date) {
        this.mealID = mealID;
        this.mealType = mealType;
        this.caloriesIntake = caloriesIntake;
        this.date = date;
    }

    public int getMealID() {
        return mealID;
    }

    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getCaloriesIntake() {
        return caloriesIntake;
    }

    public void setCaloriesIntake(int caloriesIntake) {
        this.caloriesIntake = caloriesIntake;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealID=" + mealID +
                ", mealType='" + mealType + '\'' +
                ", caloriesIntake=" + caloriesIntake +
                ", date=" + date +
                '}';
    }
}

