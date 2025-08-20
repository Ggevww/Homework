package homework11.task6;

/**
 * Enum representing different shapes that can be drawn.
 * Each shape implements the Drawable interface to provide its own drawing logic.
 */
public enum Shape implements Drawable{
    CIRCLE{
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    },
    SQUARE{
        @Override
        public void draw() {
            System.out.println("Drawing a Square");
        }
    },
    TRIANGLE{
        @Override
        public void draw() {
            System.out.println("Drawing a Triangle");
        }
    };
}
