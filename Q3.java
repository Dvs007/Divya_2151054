import java.util.ArrayList;
import java.util.List;

public class CollegeManager {
    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    public CollegeManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(int studentID, int courseID, String enrollmentDate) {
        Student student = getStudentByID(studentID);
        Course course = getCourseByID(courseID);

        if (student != null && course != null) {
            if (!course.isFull()) {
                Enrollment enrollment = new Enrollment(enrollments.size() + 1, studentID, courseID, enrollmentDate);
                enrollments.add(enrollment);
                course.enrollStudent();
            } else {
                System.out.println("Course is already full. Cannot enroll the student.");
            }
        } else {
            System.out.println("Student or course not found.");
        }
    }

    public List<Student> getStudentsEnrolledInCourse(int courseID) {
        List<Student> enrolledStudents = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourseID() == courseID) {
                Student student = getStudentByID(enrollment.getStudentID());
                if (student != null) {
                    enrolledStudents.add(student);
                }
            }
        }
        return enrolledStudents;
    }

    public List<Course> getCoursesEnrolledByStudent(int studentID) {
        List<Course> enrolledCourses = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudentID() == studentID) {
                Course course = getCourseByID(enrollment.getCourseID());
                if (course != null) {
                    enrolledCourses.add(course);
                }
            }
        }
        return enrolledCourses;
    }

    private Student getStudentByID(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }

    private Course getCourseByID(int courseID) {
        for (Course course : courses) {
            if (course.getCourseID() == courseID) {
                return course;
            }
        }
        return null;
    }
}
