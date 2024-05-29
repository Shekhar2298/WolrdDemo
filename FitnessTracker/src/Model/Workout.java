package Model;

import java.time.LocalDate;

public class Workout {
    private int workoutID;
    private String workoutType;
    private int duration;
    private int caloriesBurned;
    private LocalDate date;

    public Workout(int workoutID, String workoutType, int duration, int caloriesBurned, LocalDate date) {
        this.workoutID = workoutID;
        this.workoutType = workoutType;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.date = date;
    }

    public int getWorkoutID() {
        return workoutID;
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "workoutID=" + workoutID +
                ", workoutType='" + workoutType + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                ", date=" + date +
                '}';
    }
}
