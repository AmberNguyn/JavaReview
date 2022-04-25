package Student;

import java.util.Comparator;

public class StudentSortByCourseYear implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourseYear() - o2.getCourseYear();
    }

}
