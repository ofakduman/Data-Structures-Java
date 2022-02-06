package com.company;

public class Senior extends Customer{
    private static final double SAVINGS_INTEREST = 0.08;
    private static final double CHECK_INTEREST = 0.04;
    private static final double CHECK_CHARGE = 1.0;
    private static final double OVERDRAFT_PENALTY = 10.0;


    public Senior(String name, String address, int age, String telNumber) {
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
