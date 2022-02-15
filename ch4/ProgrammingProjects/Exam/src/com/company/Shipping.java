package com.company;

public class Shipping {
    /**
     * A method to calculate minimum will gonna use package
     * @param items
     * @param availableLargePackages
     * @param availableSmallPackages
     * @return int represents will gonna used number of packages
     *          -1 if packages are not required amount
     */
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        int largePacage = availableLargePackages;
        int tempItem = items;
        int usedPack = 0;
        int ifonlyUsedLarPack = (int) items/5;
        
        if(availableLargePackages>=ifonlyUsedLarPack){
            int remainder = tempItem%5;
            return ifonlyUsedLarPack + remainder;
        }

        int remain = availableLargePackages*5;
        remain = items - remain;
        usedPack =  largePacage+remain;
        if (usedPack> availableLargePackages+availableSmallPackages)
            return -1;
        return usedPack;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(16, 2, 10));
    }
}