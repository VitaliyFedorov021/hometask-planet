package ua.com.alevel.planets;

public class Main {
    public static void main(String[] args) {
        Planets planet1 = new Earth();
        Planets planet2 = new Mars();
        Planets planet3 = new Venus();
        Planets planet4 = new Neptune();
        Planets planet5 = new Uranus();
        planet1.setAccelerationOfGravity(9.81);
        planet2.setAccelerationOfGravity(3.86);
        planet3.setAccelerationOfGravity(8.88);
        planet4.setAccelerationOfGravity(11.09);
        planet5.setAccelerationOfGravity(8.86);
        PlanetReporter reporter = new PlanetReporter();
        reporter.report(planet1);
        reporter.report(planet2);
        reporter.report(planet3);
        reporter.report(planet4);
        reporter.report(planet5);
    }
}
