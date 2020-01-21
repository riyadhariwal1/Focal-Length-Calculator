package ca.cmpt276A2;

public class Lens {
    private String make;
    private double maxAperture;
    private int focalLength;

    public Lens(String make, double maxAperture, int focalLength) {
        this.make = make;
        this.maxAperture = maxAperture;
        this.focalLength = focalLength;
    }

    public double getMaxAperture() {
        return maxAperture;
    }

    public int getFocalLength() {
        return focalLength;
    }

    @Override
    public String toString() {
        return make + " " + focalLength + "mm F" + maxAperture;
    }
}
