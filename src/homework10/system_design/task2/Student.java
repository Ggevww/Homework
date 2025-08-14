package homework10.system_design.task2;

import java.util.Arrays;
/** * Represents a student with a name, ID, and enrolled courses.
 * Provides methods to get and set student details, enroll in courses,
 * and check for duplicate enrollments.
 */
public class Student {
    private String name;
    private int id;
    private Course[] courses;

    /** * Returns the name of the student.
     * @return the name of the student
     */
    public String getName() {
        return this.name;
    }
    /** * Sets the name of the student.
     * @param name the name to set for the student
     */
    public void setName(String name) {
        this.name = name;
    }
    /** * Returns the ID of the student.
     * @return the ID of the student
     */
    public int getId() {
        return this.id;
    }
    /** * Sets the ID of the student.
     * Validates that the ID is greater than 0 before setting it.
     * @param id the ID to set for the student
     */
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Id cant be negative or 0");
        }

    }
    /** * Enrolls the student in a course if the student is not already enrolled.
     * Checks for duplicate enrollments based on student ID.
     * If the student is already enrolled, prints a message indicating the issue.
     * @param course the course to enroll the student in
     */
    public void enroll(Course course){
        if(course.check(this)){
            courses = Arrays.copyOf(courses, courses.length + 1);
            courses[courses.length-1] = course;
            course.addStudent(this);
            System.out.println("Student " + this.name + " with id " + this.id + " enrolled in course " + course.getCourseName());
        }else {
            System.out.println("Student with the same id can't enroll");
        }

    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
    /** * Constructs a Student object with a name and ID.
     * Initializes the courses array to an empty array.
     * @param name the name of the student
     * @param id the ID of the student
     */
    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.courses = new Course[0];
    }
}
