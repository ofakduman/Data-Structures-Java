package com.company;

public class HMO extends Insurance{
    private static final String INSURANCE_NAME = "HMO";

    public HMO(double percent_payment_by_insurance, String insuranceName) {
        super(percent_payment_by_insurance, (byte) 1, INSURANCE_NAME);
    }
    public String getInsurance(){return INSURANCE_NAME;}

}
