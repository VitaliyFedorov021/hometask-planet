package ua.com.alevel.planets;

public abstract class Planets implements Planet {
    private double accelerationOfGravity;
    public abstract String getName();
    public double getAccelerationOfGravity() {
        return accelerationOfGravity;
    }
    public void setAccelerationOfGravity(double accelerationOfGravity) {
        this.accelerationOfGravity = accelerationOfGravity;
    }
}
