public class Enrollment {
    private int enrollmentID;
    private int studentID;
    private int courseID;
    private String enrollmentDate;

    public Enrollment(int enrollmentID, int studentID, int courseID, String enrollmentDate) {
        this.enrollmentID = enrollmentID;
        this.studentID = studentID;
        this.courseID = courseID;
        this.enrollmentDate = enrollmentDate;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }
}
