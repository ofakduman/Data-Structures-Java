package com.company;

public class Vegetable extends Food {
    private static double VEG_FAT_CAL;
    private static double VEG_PROTEIN_CAL;
    private static double VEG_CARBO_CAL;

    public Vegetable(double calories, int protein, double fat) {
        super.setCalories(calories);

        do {
            protein /= 2;
        } while((double)protein > calories);

        VEG_PROTEIN_CAL = (double)protein / calories;
        double remainder = calories - VEG_PROTEIN_CAL;

        do {
            fat /= 2.0D;
        } while(fat > remainder);

        VEG_FAT_CAL = fat / remainder;
        remainder -= VEG_FAT_CAL;
        VEG_CARBO_CAL = remainder;
    }

    public double percentProtein() {
        return VEG_PROTEIN_CAL / (VEG_PROTEIN_CAL + VEG_FAT_CAL + VEG_CARBO_CAL);
    }

    public double percentFat() {
        return VEG_FAT_CAL / (VEG_PROTEIN_CAL + VEG_FAT_CAL + VEG_CARBO_CAL);
    }

    public double percentCarbohydrates() {
        return VEG_CARBO_CAL / (VEG_PROTEIN_CAL + VEG_FAT_CAL + VEG_CARBO_CAL);
    }
}
