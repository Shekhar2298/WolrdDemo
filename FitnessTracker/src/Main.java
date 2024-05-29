

import Model.HealthMetric;
import Model.Meal;
import Model.Workout;
import service.HealthMetricService;
import service.MealService;
import service.WorkoutService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static WorkoutService workoutService = new WorkoutService();
    private static MealService mealService = new MealService();
    private static HealthMetricService healthMetricService = new HealthMetricService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Fitness Tracker Menu:");
            System.out.println("1. Add Workout");
            System.out.println("2. View Workouts");
            System.out.println("3. Update Workout");
            System.out.println("4. Delete Workout");
            System.out.println("5. Add Meal");
            System.out.println("6. View Meals");
            System.out.println("7. Update Meal");
            System.out.println("8. Delete Meal");
            System.out.println("9. Add Health Metric");
            System.out.println("10. View Health Metrics");
            System.out.println("11. Update Health Metric");
            System.out.println("12. Delete Health Metric");
            System.out.println("13. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        addWorkout(scanner);
                        break;
                    case 2:
                        viewWorkouts();
                        break;
                    case 3:
                        updateWorkout(scanner);
                        break;
                    case 4:
                        deleteWorkout(scanner);
                        break;
                    case 5:
                        addMeal(scanner);
                        break;
                    case 6:
                        viewMeals();
                        break;
                    case 7:
                        updateMeal(scanner);
                        break;
                    case 8:
                        deleteMeal(scanner);
                        break;
                    case 9:
                        addHealthMetric(scanner);
                        break;
                    case 10:
                        viewHealthMetrics();
                        break;
                    case 11:
                        updateHealthMetric(scanner);
                        break;
                    case 12:
                        deleteHealthMetric(scanner);
                        break;
                    case 13:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void addWorkout(Scanner scanner) throws SQLException {
        System.out.print("Enter workout type: ");
        String workoutType = scanner.nextLine();
        System.out.print("Enter duration (in minutes): ");
        int duration = scanner.nextInt();
        System.out.print("Enter calories burned: ");
        int caloriesBurned = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        Workout workout = new Workout(0, workoutType, duration, caloriesBurned, date);
        workoutService.addWorkout(workout);
        System.out.println("Workout added successfully!");
    }

    private static void viewWorkouts() throws SQLException {
        List<Workout> workouts = workoutService.getAllWorkouts();
        if (workouts.isEmpty()) {
            System.out.println("No workouts found.");
        } else {
            for (Workout workout : workouts) {
                System.out.println(workout.getWorkoutID() + ": " +
                        "Workout: " + workout.getWorkoutType() + " - " +
                        "Duration: " + workout.getDuration() + " mins - " +
                        "Calories Burned: " + workout.getCaloriesBurned() + " - " +
                        "Date: " + workout.getDate());
            }
        }
    }

    private static void updateWorkout(Scanner scanner) throws SQLException {
        System.out.print("Enter workout ID to update: ");
        int workoutID = scanner.nextInt();
        scanner.nextLine();

        Workout workout = workoutService.getWorkout(workoutID);
        if (workout == null) {
            System.out.println("Workout not found.");
            return;
        }

        System.out.print("Enter new workout type (current: " + workout.getWorkoutType() + "): ");
        String workoutType = scanner.nextLine();
        System.out.print("Enter new duration (current: " + workout.getDuration() + " mins): ");
        int duration = scanner.nextInt();
        System.out.print("Enter new calories burned (current: " + workout.getCaloriesBurned() + "): ");
        int caloriesBurned = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new date (current: " + workout.getDate() + ") (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        workout.setWorkoutType(workoutType);
        workout.setDuration(duration);
        workout.setCaloriesBurned(caloriesBurned);
        workout.setDate(date);
        workoutService.updateWorkout(workout);
        System.out.println("Workout updated successfully!");
    }

    private static void deleteWorkout(Scanner scanner) throws SQLException {
        System.out.print("Enter workout ID to delete: ");
        int workoutID = scanner.nextInt();
        scanner.nextLine();

        workoutService.deleteWorkout(workoutID);
        System.out.println("Workout deleted successfully!");
    }

    private static void addMeal(Scanner scanner) throws SQLException {
        System.out.print("Enter meal type: ");
        String mealType = scanner.nextLine();
        System.out.print("Enter calories intake: ");
        int caloriesIntake = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        Meal meal = new Meal(0, mealType, caloriesIntake, date);
        mealService.addMeal(meal);
        System.out.println("Meal added successfully!");
    }

    private static void viewMeals() throws SQLException {
        List<Meal> meals = mealService.getAllMeals();
        if (meals.isEmpty()) {
            System.out.println("No meals found.");
        } else {
            for (Meal meal : meals) {
                System.out.println(meal.getMealID() + ": " +
                        "Meal: " + meal.getMealType() + " - " +
                        "Calories Intake: " + meal.getCaloriesIntake() + " - " +
                        "Date: " + meal.getDate());
            }
        }
    }

    private static void updateMeal(Scanner scanner) throws SQLException {
        System.out.print("Enter meal ID to update: ");
        int mealID = scanner.nextInt();
        scanner.nextLine();

        Meal meal = mealService.getMeal(mealID);
        if (meal == null) {
            System.out.println("Meal not found.");
            return;
        }

        System.out.print("Enter new meal type (current: " + meal.getMealType() + "): ");
        String mealType = scanner.nextLine();
        System.out.print("Enter new calories intake (current: " + meal.getCaloriesIntake() + "): ");
        int caloriesIntake = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new date (current: " + meal.getDate() + ") (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        meal.setMealType(mealType);
        meal.setCaloriesIntake(caloriesIntake);
        meal.setDate(date);
        mealService.updateMeal(meal);
        System.out.println("Meal updated successfully!");
    }

    private static void deleteMeal(Scanner scanner) throws SQLException {
        System.out.print("Enter meal ID to delete: ");
        int mealID = scanner.nextInt();
        scanner.nextLine();

        mealService.deleteMeal(mealID);
        System.out.println("Meal deleted successfully!");
    }

    private static void addHealthMetric(Scanner scanner) throws SQLException {
        System.out.print("Enter user ID: ");
        int userID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter metric type: ");
        String metricType = scanner.nextLine();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        HealthMetric healthMetric = new HealthMetric(0, userID, metricType, value, date);
        healthMetricService.addHealthMetric(healthMetric);
        System.out.println("Health metric added successfully!");
    }

    private static void viewHealthMetrics() throws SQLException {
        List<HealthMetric> healthMetrics = healthMetricService.getAllHealthMetrics();
        if (healthMetrics.isEmpty()) {
            System.out.println("No health metrics found.");
        } else {
            for (HealthMetric healthMetric : healthMetrics) {
                System.out.println(healthMetric.getMetricID() + ": " +
                        "User: " + healthMetric.getUserID() + " - " +
                        "Metric: " + healthMetric.getMetricType() + " - " +
                        "Value: " + healthMetric.getValue() + " - " +
                        "Date: " + healthMetric.getDate());
            }
        }
    }

    private static void updateHealthMetric(Scanner scanner) throws SQLException {
        System.out.print("Enter health metric ID to update: ");
        int metricID = scanner.nextInt();
        scanner.nextLine();

        HealthMetric healthMetric = healthMetricService.getHealthMetric(metricID);
        if (healthMetric == null) {
            System.out.println("Health metric not found.");
            return;
        }

        System.out.print("Enter new user ID (current: " + healthMetric.getUserID() + "): ");
        int userID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new metric type (current: " + healthMetric.getMetricType() + "): ");
        String metricType = scanner.nextLine();
        System.out.print("Enter new value (current: " + healthMetric.getValue() + "): ");
        double value = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter new date (current: " + healthMetric.getDate() + ") (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        healthMetric.setUserID(userID);
        healthMetric.setMetricType(metricType);
        healthMetric.setValue(value);
        healthMetric.setDate(date);
        healthMetricService.updateHealthMetric(healthMetric);
        System.out.println("Health metric updated successfully!");
    }

    private static void deleteHealthMetric(Scanner scanner) throws SQLException {
        System.out.print("Enter health metric ID to delete: ");
        int metricID = scanner.nextInt();
        scanner.nextLine();

        healthMetricService.deleteHealthMetric(metricID);
        System.out.println("Health metric deleted successfully!");
    }
}