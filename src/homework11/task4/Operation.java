package homework11.task4;

/**
 * An enum representing basic arithmetic operations.
 * Each operation can be applied to two integers.
 */
public enum Operation {
    ADD{
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT{
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY{
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE{
        @Override
        public int apply(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        }
    };


    /**
     * Applies the operation to two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the result of the operation
     */
    public abstract int apply(int a, int b);
}
