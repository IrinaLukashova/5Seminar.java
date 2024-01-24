package Data;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    Teacher teacher;
    List<Student> studentsList = new ArrayList<>();

    public StudentGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                '}';
    }
}
