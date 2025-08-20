package homework11.task2;

public class TestPlanet {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf(planet.name() + " " +
                              planet.getMass() + " " +
                              planet.getRadius() + " ");
        }


    }
}
