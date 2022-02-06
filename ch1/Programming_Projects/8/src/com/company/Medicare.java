package com.company;

public class Medicare extends Insurance{
    private static final String INSURANCE_NAME = "Medicare";

    public Medicare(double percent_payment_by_insurance, String insuranceName) {
        super(percent_payment_by_insurance, (byte) 0, INSURANCE_NAME);
    }
    public String getInsurance(){return INSURANCE_NAME;}

}
