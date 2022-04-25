package Student;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String DoB;
    private int courseYear;

    public Student(String studentId, String firstName, String lastName, String doB, int courseYear) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        DoB = doB;
        this.courseYear = courseYear;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    Student(Integer courseYear)
    {
        this.courseYear = courseYear;
    }


    public String toString()
    {
        String str = "Student ID: " + studentId + "\n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Date of Birth: " + DoB + "\n" +
                "Course year: " + courseYear + "\n";
        return str;
    }


}
