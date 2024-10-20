package com.shivprakash.to_dolist;

public class Task {
    private String taskName;
    private String priority;
    private String category;
    private String dueDate;
    private String dueTime;
    private String imageUri;
    private boolean completed;
    private double latitude;
    private double longitude;

    public Task(String taskName, String priority, String category, String dueDate, String dueTime, String string, boolean completed) {
        this.taskName = taskName;
        this.priority = priority;
        this.category = category;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
        this.imageUri = imageUri;
        this.completed = completed;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String getImageUri() { // Getter for imageUri
        return imageUri;
    }

    public void setImageUri(String imageUri) { // Setter for imageUri
        this.imageUri = imageUri;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


}
