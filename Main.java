public class Main {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();

        Student student1 = new Student(1, "Alice", "alice@example.com", "123-456-7890", "123 Main St");
        Student student2 = new Student(2, "Bob", "bob@example.com", "987-654-3210", "456 Elm St");
        collegeManager.addStudent(student1);
        collegeManager.addStudent(student2);

        Course course1 = new Course(101, "Introduction to Programming", "Dr. Smith", 3, 30);
        Course course2 = new Course(102, "Database Management", "Prof. Johnson", 4, 25);
        collegeManager.addCourse(course1);
        collegeManager.addCourse(course2);

        collegeManager.enrollStudentInCourse(1, 101, "2023-09-22");
        collegeManager.enrollStudentInCourse(2, 101, "2023-09-23");

        List<Student> studentsInCourse101 = collegeManager.getStudentsEnrolledInCourse(101);
        List<Course> coursesEnrolledByStudent1 = collegeManager.getCoursesEnrolledByStudent(1);

        System.out.println("Students in Course 101:");
        for (Student student : studentsInCourse101) {
            System.out.println(student.getName());
        }

        System.out.println("\nCourses enrolled by Student 1:");
        for (Course course : coursesEnrolledByStudent1) {
            System.out.println(course.getCourseName());
        }
    }
}
