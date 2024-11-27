package com.example.demo.model;

public class Record {
    private String name;
    private int percentage;

    // Constructor
    public Record(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPercentage() {
        return percentage;
    }

    // Setters (Optional if you need to modify data)
    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
