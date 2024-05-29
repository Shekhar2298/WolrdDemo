package Model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HealthMetric {
    private int metricID;
    private int userID;
    private String metricType;
    private double value;
    private LocalDate date;

    public HealthMetric(int metricID, int userID, String metricType, double value, LocalDate date) {
        this.metricID = metricID;
        this.userID = userID;
        this.metricType = metricType;
        this.value = value;
        this.date = date;
    }

    public int getMetricID() {
        return metricID;
    }

    public void setMetricID(int metricID) {
        this.metricID = metricID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HealthMetric{" +
                "metricID=" + metricID +
                ", userID=" + userID +
                ", metricType='" + metricType + '\'' +
                ", value=" + value +
                ", date=" + date +
                '}';
    }
}

