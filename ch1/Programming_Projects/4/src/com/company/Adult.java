package com.company;

public class Adult extends Customer{
    private static final double SAVINGS_INTEREST = 0.03;
    private static final double CHECK_INTEREST = 0.01;
    private static final double CHECK_CHARGE = 3.0;
    private static final double OVERDRAFT_PENALTY = 25.0;


    public Adult(String name, String address, int age, String telNumber) {
        super(name, address, age, telNumber);
    }

    @Override
    public double getSavingInterest() {
        return SAVINGS_INTEREST;
    }

    @Override
    public double getCheckingInterest() {
        return CHECK_INTEREST;
    }

    @Override
    public double getCheckCharge() {
        return CHECK_CHARGE;
    }

    public double getOverdraftPenalty() {
        return OVERDRAFT_PENALTY;
    }


}
