package com.company;

public class PrintMean {

    public static void main(String[] args) {
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1.0,1.0,3.0,3.0));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1.0,2.0,3.0,4.0));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1.0,-2.0,3.0,-4.0));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1.0,-11.0,24.0,2.0));
        System.out.println("Mean of -11, -111, 244, 22: " + meanCalc(-11.0,-111.0,244.0,22.0));
    }
    public static String meanCalc(double a, double b, double c, double d){
        double mean = (a + b + c + d) / 4;
        String meanString = String.valueOf(mean);
        return meanString;


    }
}