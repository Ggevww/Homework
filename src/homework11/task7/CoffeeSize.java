package homework11.task7;

/**
 * Enum representing different sizes of coffee with a method to print the name and ordinal value.
 */
public enum CoffeeSize {
    SMALL{
        @Override
        public void nameIndex(){
            System.out.println("Name: small, ordinal value: 0");
        }
    },
    MEDIUM{
        @Override
        public void nameIndex(){
            System.out.println("Name: medium, ordinal value: 1");
        }
    },
    LARGE{
        @Override
        public void nameIndex(){
            System.out.println("Name: large, ordinal value: 2");
        }
    };


    /**
     * Abstract method to be implemented by each enum constant to print its name and ordinal value.
     */
    public abstract void nameIndex();
}
