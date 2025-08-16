package homework10.system_design.task2;

import java.util.Arrays;

/**
 * Course class representing a course with a name, capacity, and enrolled students.
 * It includes methods to check enrollment eligibility, add students, and print course details.
 */
public class Course {
    private String courseName;
    private final int capacity;
    private Student[] students;

    /**
     * Returns the name of the course.
     * @return the name of the course
     */
    public String getCourseName(){
        return this.courseName;
    }
    /**
     * Sets the name of the course.
     * @param courseName the name to set for the course
     */
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    /**
     * Returns the capacity of the course.
     * @return the capacity of the course
     */
    public int getCapacity(){
        return this.capacity;
    }

    /**
     * checks if a student can be enrolled in the course.
     * @param student the student to check for enrollment
     * @return true if the student can be enrolled, false if the student is already enrolled
     */
    public boolean check(Student student){
        for (Student i: students){
            if(i.getId() == student.getId()){
                return false;
            }
        }
        return true;
    }
    /**
     * Adds a student to the course if the course is not full.
     * If the course is full, prints a message indicating that enrollment is not possible.
     * @param student the student to add to the course
     */
    public void addStudent(Student student){
        if(students.length < capacity){
            students = Arrays.copyOf(students, students.length + 1);
            students[students.length - 1] = student;
        }else {
            System.out.println("You can't enroll cause course is full");
        }

    }
    /**
     * Prints the course name and details of all enrolled students.
     * Each student's details are printed using their toString method.
     */
    public void print(){
        System.out.println("Course: " + this.courseName);
        for(Student i: students){
            System.out.println(i.toString());
        }
    }

    /**
     * Constructs a Course object with a specified name and capacity.
     * If the capacity is less than or equal to 0, it defaults to 30.
     * Initializes the students array to an empty array.
     * @param courseName the name of the course
     * @param capacity the maximum number of students allowed in the course
     */
    public Course(String courseName, int capacity){
        this.courseName = courseName;
        if(capacity>0){
            this.capacity = capacity;
        }else {
            this.capacity = 30;
        }
        this.students = new Student[0];
    }
    /**
     * Constructs a Course object with a specified name and a default capacity of 30.
     * Initializes the students array to an empty array.
     * @param courseName the name of the course
     */
    public Course(String courseName){
        this(courseName, 30);
    }

}
