package service;



import dao.WorkoutDAO;
import Model.Workout;

import java.sql.SQLException;
import java.util.List;

public class WorkoutService {
    private WorkoutDAO workoutDAO;

    public WorkoutService() {
        this.workoutDAO = new WorkoutDAO();
    }

    public void addWorkout(Workout workout) throws SQLException {
        workoutDAO.addWorkout(workout);
    }

    public Workout getWorkout(int workoutID) throws SQLException {
        return workoutDAO.getWorkout(workoutID);
    }

    public List<Workout> getAllWorkouts() throws SQLException {
        return workoutDAO.getAllWorkouts();
    }

    public void updateWorkout(Workout workout) throws SQLException {
        workoutDAO.updateWorkout(workout);
    }

    public void deleteWorkout(int workoutID) throws SQLException {
        workoutDAO.deleteWorkout(workoutID);
    }
}

