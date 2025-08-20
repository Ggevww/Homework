package homework11.task6;

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
