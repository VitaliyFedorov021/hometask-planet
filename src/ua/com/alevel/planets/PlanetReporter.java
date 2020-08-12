package ua.com.alevel.planets;

public class PlanetReporter {
    public void report(Planets obj) {
        System.out.println("Acceleration of gravity in the " + obj.getName() + " = " + obj.getAccelerationOfGravity());
    }
}
