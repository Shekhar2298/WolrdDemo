package dao;

import Model.HealthMetric;
import Utility.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HealthMetricDAO {

    public void addHealthMetric(HealthMetric metric) throws SQLException {
        String query = "INSERT INTO HealthMetrics (UserID, MetricType, Value, Date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, metric.getUserID());
            stmt.setString(2, metric.getMetricType());
            stmt.setDouble(3, metric.getValue());
            stmt.setDate(4, Date.valueOf(metric.getDate()));
            stmt.executeUpdate();
        }
    }

    public HealthMetric getHealthMetric(int metricID) throws SQLException {
        String query = "SELECT * FROM HealthMetrics WHERE MetricID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, metricID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new HealthMetric(
                        rs.getInt("MetricID"),
                        rs.getInt("UserID"),
                        rs.getString("MetricType"),
                        rs.getDouble("Value"),
                        rs.getDate("Date").toLocalDate()
                );
            }
        }
        return null;
    }

    public List<HealthMetric> getAllHealthMetrics() throws SQLException {
        List<HealthMetric> metrics = new ArrayList<>();
        String query = "SELECT * FROM HealthMetrics";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                metrics.add(new HealthMetric(
                        rs.getInt("MetricID"),
                        rs.getInt("UserID"),
                        rs.getString("MetricType"),
                        rs.getDouble("Value"),
                        rs.getDate("Date").toLocalDate()
                ));
            }
        }
        return metrics;
    }

    public void updateHealthMetric(HealthMetric metric) throws SQLException {
        String query = "UPDATE HealthMetrics SET UserID = ?, MetricType = ?, Value = ?, Date = ? WHERE MetricID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, metric.getUserID());
            stmt.setString(2, metric.getMetricType());
            stmt.setDouble(3, metric.getValue());
            stmt.setDate(4, Date.valueOf(metric.getDate()));
            stmt.setInt(5, metric.getMetricID());
            stmt.executeUpdate();
        }
    }

    public void deleteHealthMetric(int metricID) throws SQLException {
        String query = "DELETE FROM HealthMetrics WHERE MetricID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, metricID);
            stmt.executeUpdate();
        }
    }
}

