package homework11.task7;

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


    public abstract void nameIndex();
}
