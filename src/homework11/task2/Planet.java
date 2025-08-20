package homework11.task2;

/**
 * Enum representing planets with their mass and radius.
 */
public enum Planet {
    EARTH(5.97e24, 6371),
    MARS(6.42e23, 3389);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
