package homework10.system_design.task2;

public class TestStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);
        Student student4 = new Student("David", 4);
        Student student5 = new Student("Eve", 5);
        Student student6 = new Student("Frank", 6);
        Student student7 = new Student("John", 6);


        Course course1 = new Course("Math", 10);
        Course course2 = new Course("Science");

        student1.enroll(course1);
        student2.enroll(course1);
        student3.enroll(course1);
        student4.enroll(course1);
        student5.enroll(course1);
        student6.enroll(course1);
        student7.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course2);
        student3.enroll(course2);
        student4.enroll(course2);
        student5.enroll(course2);
        student6.enroll(course2);
        student7.enroll(course2);
        course1.print();
        System.out.println();
        course2.print();
        System.out.println();

    }
}
