package com.company;

public class NonProfessional extends Employee{
    private double hourly_salary;
    private double vacation_day;
    private int weekly_hour;    //weekly study hour
    static final double VACATION_DAY_EARNED = 30; //After 30 hours study 1 hour vacation day earned
    static final int CONTRIBUTED_HEALTH_INSURE_PER_HOUR = 5;    //5 dollars per hour
    private double total_contributed_health_insure = 0;

    public double calculate_vacation_day_earned(){
        vacation_day+=weekly_hour/VACATION_DAY_EARNED;
        return vacation_day;
    }

    public double calculate_contributed_health_insure(){
        double weekly_health_insure= CONTRIBUTED_HEALTH_INSURE_PER_HOUR*weekly_hour;
        total_contributed_health_insure+=weekly_health_insure;
        return weekly_health_insure;
    }

    public double decrease_vacation_day(){
        if(vacation_day>1)
            vacation_day--;
        return vacation_day;
    }
    public double increase_vacation_day(double day){
        vacation_day+=day;
        return vacation_day;
    }

    public double decrease_vacation_day(double days){
        if(vacation_day-days>0)
            vacation_day=vacation_day-days;
        return vacation_day;
    }

    public double getHourly_salary() {
        return hourly_salary;
    }

    public void setHourly_salary(double hourly_salary) {
        this.hourly_salary = hourly_salary;
    }

    public double getVacation_day() {
        return vacation_day;
    }

    public void setVacation_day(int vacation_day) {
        this.vacation_day = vacation_day;
    }

    public int getWeekly_hour() {
        return weekly_hour;
    }

    public void setWeekly_hour(int weekly_hour) {
        this.weekly_hour = weekly_hour;
    }

    public NonProfessional(String name, String surname, int age, double hourly_salary, int vacation_day, int weekly_hour) {
        super(name, surname, age);
        this.hourly_salary = hourly_salary;
        this.vacation_day = vacation_day;
        this.weekly_hour = weekly_hour;
        setWeeklySalary();
    }

    public void reset_weeklyHour(){
        weekly_hour = 0;
    }

    @Override
    public double getWeeklySalary() {
        setWeeklySalary();
        return super.weeklySalary;
    }

    @Override
    public void setWeeklySalary() {
        super.weeklySalary = calculateWeeklySalary();
    }

    @Override
    public double calculateWeeklySalary() {
        return weekly_hour*hourly_salary;
    }

    @Override
    public void increaseSalary(double cash) {
        hourly_salary+=hourly_salary+cash;
    }

    @Override
    public void increaseSalaryRatio(double ratio) {
        hourly_salary+=hourly_salary*ratio;
    }
}
