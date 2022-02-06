package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employees[] = new Employee[5];
        employees[0] = new NonProfessional("ahmet", "soylemez", 35,
                35,8,15);

        employees[1] = new Professional("nuray", "kaya", 25,
                5000,25 );

        employees[2] = new NonProfessional("cevdet", "kackar", 22,
                95,8,15);

        employees[3] = new Professional("ferhat", "hayte", 65,
                6000,25 );
        employees[4] = new NonProfessional("pembe", "cakir", 45,
                55,8,15);

        double total_payment = calculate_weekly_total_payment(employees);

        System.out.println("Total weekly payment: " + total_payment + "$");

    }


    public static double calculate_weekly_total_payment(Employee[] employees){
        double total_payment = 0;
        for (int i = 0; i < employees.length; i++) {
            total_payment+=employees[i].weeklySalary;
        }
        return total_payment;
    }
}
