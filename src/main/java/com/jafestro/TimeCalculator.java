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
}
