package org.sdu.edu.kz;

public class Teacher extends Person{
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[5];
    }

    public String toString() {
        return "Teacher: " + super.getName() + " (" + super.getAddress() + ")";
    }

    public boolean addCourse(String course) {
        if (numCourses == courses.length) {
            return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }
}
