# Fitness and Wellness Tracker

## Overview
The Fitness and Wellness Tracker is a console-based application designed to help you monitor and manage your fitness activities, dietary habits, and overall health metrics. This project uses JDBC to interact with a MySQL database, allowing you to perform CRUD (Create, Read, Update, Delete) operations on your fitness data.

## Features
- **Track Workouts:** Log details about your workouts, including type, duration, calories burned, and date.
- **Log Meals:** Record your meals with details like meal type, calories intake, and date.
- **Monitor Health Metrics:** Keep track of various health metrics such as weight, blood pressure, etc., with values and dates.

## Project Structure
- **Model Layer:** Defines the data structures (Workout, Meal, HealthMetric) used in the application.
- **DAO (Data Access Object) Layer:** Handles database operations for each model.
- **Service Layer:** Contains business logic and interacts with the DAO layer.
- **Presentation Layer:** Provides a console-based user interface for interacting with the application.

## Database Schema
### Tables
1. **Workouts**
   - `WorkoutID` (Primary Key)
   - `WorkoutType`
   - `Duration`
   - `CaloriesBurned`
   - `Date`

2. **Meals**
   - `MealID` (Primary Key)
   - `MealType`
   - `CaloriesIntake`
   - `Date`

3. **HealthMetrics**
   - `MetricID` (Primary Key)
   - `UserID`
   - `MetricType`
   - `Value`
   - `Date`

## How to Use
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Shekhar2298/WorldDemo.git
   cd fitnessTracker
