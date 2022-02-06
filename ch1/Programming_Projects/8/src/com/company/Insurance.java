package com.company;

public abstract class Insurance {
    private double percent_payment_by_insurance;
    private byte type;  //0 for medicare; 1 for HMO; 2 for others
    private String insuranceName;

    public Insurance(double percent_payment_by_insurance, byte type, String insuranceName) {
        this.percent_payment_by_insurance = percent_payment_by_insurance;
        this.type = type;
        this.insuranceName = insuranceName;
    }

    public abstract String getInsurance();
    public double getPercent_payment_by_insurance() {
        return percent_payment_by_insurance;
    }

    public void setPercent_payment_by_insurance(double percent_payment_by_insurance) {
        this.percent_payment_by_insurance = percent_payment_by_insurance;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
