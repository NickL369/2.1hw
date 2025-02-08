package app;

public class Main {
    private static final double MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App - Version 1.0");

        double miles = 10;
        double kilometers = convertMilesToKm(miles);
        System.out.println(miles + " miles is " + kilometers + " kilometers.");
    }

    private static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }
}
