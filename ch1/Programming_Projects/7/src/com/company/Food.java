package com.company;

public abstract class Food {
    private double calories;

    public Food() {
    }

    public abstract double percentProtein();

    public abstract double percentFat();

    public abstract double percentCarbohydrates();

    public double getCalories() {
        return this.calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
