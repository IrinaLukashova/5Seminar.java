package Controler;

import Data.*;
import Service.DataService;
import Service.StudentGroupService;
import View.StudentView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controler {
    private final DataService service = new DataService();
    private final StudentGroupService service2 = new StudentGroupService();

    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    private Teacher getTeacherByID(int teacherID) {
        for (User user : service.getAllUser()) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == teacherID)
                return (Teacher) user;
        }
        return null;
    }

    private Student getStudentByID(int studentID) {
        for (User user : service.getAllUser()) {
            if (user instanceof Student && ((Student) user).getStudentId() == studentID)
                return (Student) user;
        }
        return null;
    }

    public StudentGroup createStudentGroup() {
        System.out.println("Введите id учителя");
        Scanner scTeacher = new Scanner(System.in);
        int teacherID = scTeacher.nextInt();

        Teacher teacher = getTeacherByID(teacherID);

        List<Student> studentList = new ArrayList<>();
        Scanner scStudents = new Scanner(System.in);
        System.out.println("Введите id учеников через пробел, поставив в конце списка 0");
        while (!(scStudents.nextInt() == 0)) {

            int studentID = scStudents.nextInt();
            studentList.add(getStudentByID(studentID));
        }

        return service2.createGroup(teacher, studentList);
    }
    public void printStudentGroup (StudentGroup studentGroup) {
        System.out.println(studentGroup);
    }

}
