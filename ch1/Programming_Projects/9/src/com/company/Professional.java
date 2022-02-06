package com.company;

public class Professional extends Employee{
    private double monthly_salary;
    private int vacation_day;
    static final int CONTRIBUTED_HEALTH_INSURE_PER_MONTH = 1000;    //1000 dollars per hour



    public Professional(String name, String surname, int age, double monthly_salary, int vacation_day) {
        super(name, surname, age);
        this.monthly_salary = monthly_salary;
        this.vacation_day = vacation_day;
        setWeeklySalary();
    }

    public int decrease_vacation_day(){
        if(vacation_day>1)
            vacation_day--;
        return vacation_day;
    }
    public int increase_vacation_day(int day){
        vacation_day+=day;
        return vacation_day;
    }

    public int decrease_vacation_day(int days){
        if(vacation_day-days>0)
            vacation_day=vacation_day-days;
        return vacation_day;
    }

    public double getMonthly_salary() {
        return monthly_salary;
    }

    public void setMonthly_salary(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public int getVacation_day() {
        return vacation_day;
    }

    public void setVacation_day(int vacation_day) {
        this.vacation_day = vacation_day;
    }

    @Override
    public double getWeeklySalary() {
        return super.weeklySalary;
    }

    @Override
    public void setWeeklySalary() {
        super.weeklySalary = calculateWeeklySalary();
    }

    @Override
    public double calculateWeeklySalary() {
        return monthly_salary*0.233;
    }

    @Override
    public void increaseSalary(double cash) {
        monthly_salary+=cash;
        setWeeklySalary();
    }

    @Override
    public void increaseSalaryRatio(double ratio) {
        monthly_salary += monthly_salary*ratio;
        setWeeklySalary();
    }
}
