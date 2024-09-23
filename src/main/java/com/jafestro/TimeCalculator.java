package com.jafestro;

public class TimeCalculator {
    /****
     * 
     * @param distance in kilometers
     * @param speed in in kilometers per hour kmh
     * @return time in hours
     */
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }

        double time = distance / speed; // in hours
        return time;
    }

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();
        System.out.println("Hello from Docker! It is Jafar here.");
        System.out.println("Distance: 100.0 km, Speed: 50.0 km/h");
        System.out.print("Time: ");
        System.out.println(calculator.calculateTime(100.0, 50.0));
    }
}
