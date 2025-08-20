package homework11.task4;

public class TestOperation {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        for (Operation operation : Operation.values()) {
            System.out.printf("Operation: %s, Result: %d%n", operation.name(), operation.apply(a, b));
        }
    }
}
