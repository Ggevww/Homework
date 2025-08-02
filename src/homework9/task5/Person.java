package homework9.task5;

public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Person[] people = {
                new Person("Alice", 25, 160),
                new Person("Bob", 32, 180),
                new Person("Charlie", 40, 175)
        };
        Person oldest = (Person) HighestValue.getHighestByValue(people, "age");
        System.out.println("Oldest person: " + oldest.getName() + ", Age: " + oldest.getAge());
        Person tallest = (Person) HighestValue.getHighestByValue(people, "height");
        System.out.println("Tallest person: " + tallest.getName() + ", Height: " + tallest.getHeight());
    }
}
