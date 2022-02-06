package com.company;

import java.util.Objects;

public abstract class Employee {
    private String name;
    private String surname;
    private int age;
    protected double weeklySalary;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract double getWeeklySalary();
    public abstract void setWeeklySalary();
    public abstract double calculateWeeklySalary();
    public abstract void increaseSalary(double cash);  //as dollar ie salary is 100 dollars increased 10 dollars new sallary 110 dollars
    public abstract void increaseSalaryRatio(double ratio);//ratio is 0.1 and salary is 100 dollars new salary = 110 dollars increased 10 percent

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.getWeeklySalary(), getWeeklySalary()) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, getWeeklySalary());
    }
}
