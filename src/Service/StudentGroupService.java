package Service;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    public StudentGroup createGroup(Teacher teacher, List<Student> studentList) {
        return new StudentGroup(teacher, studentList);
    }



}
