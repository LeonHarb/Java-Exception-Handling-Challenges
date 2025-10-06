// Assignment #10: Exception Challenges
// Challenge #4 by Leon Harb

import java.util.Arrays;
import java.util.List;

public class Student {
    private static final List<String> ALLOWED_COURSES = Arrays.asList("CS101", "MATH201", "BIO301");

    public void registerCourse(String courseCode) throws CourseNotFoundException {
        if (!ALLOWED_COURSES.contains(courseCode.toUpperCase())) {
            throw new CourseNotFoundException(courseCode + " is not a valid course.");
        }
        System.out.println("Successfully registered for " + courseCode);
    }
}
