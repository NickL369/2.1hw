package app;

public class Main {
    private static final double MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App - Version 1.0");

        double miles = 10;
        double kilometers = convertMilesToKm(miles);
        System.out.println(miles + " miles is " + kilometers + " kilometers.");

        double km = 16.0934;
        double milesConverted = convertKmToMiles(km);
        System.out.println(km + " kilometers is " + milesConverted + " miles.");
    }

    private static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    private static double convertKmToMiles(double kilometers) {
        return kilometers / MILES_TO_KM;
    }
}