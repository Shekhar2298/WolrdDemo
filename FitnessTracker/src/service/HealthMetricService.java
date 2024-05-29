
package service;

import dao.HealthMetricDAO;
import Model.HealthMetric;

import java.sql.SQLException;
import java.util.List;

public class HealthMetricService {
    private HealthMetricDAO healthMetricDAO;

    public HealthMetricService() {
        this.healthMetricDAO = new HealthMetricDAO();
    }

    public void addHealthMetric(HealthMetric healthMetric) throws SQLException {
        healthMetricDAO.addHealthMetric(healthMetric);
    }

    public HealthMetric getHealthMetric(int metricID) throws SQLException {
        return healthMetricDAO.getHealthMetric(metricID);
    }

    public List<HealthMetric> getAllHealthMetrics() throws SQLException {
        return healthMetricDAO.getAllHealthMetrics();
    }

    public void updateHealthMetric(HealthMetric healthMetric) throws SQLException {
        healthMetricDAO.updateHealthMetric(healthMetric);
    }

    public void deleteHealthMetric(int metricID) throws SQLException {
        healthMetricDAO.deleteHealthMetric(metricID);
    }
}

