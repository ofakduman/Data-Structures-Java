package com.company;

public class Other extends Insurance{
    private static final String INSURANCE_NAME = "Other";

    public Other(double percent_payment_by_insurance, String insuranceName) {
        super(percent_payment_by_insurance, (byte) 2, INSURANCE_NAME);
    }
    public String getInsurance(){return INSURANCE_NAME;}

}
