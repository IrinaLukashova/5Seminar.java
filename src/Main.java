import Controler.Controler;
import Data.StudentGroup;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        //controler.getAllStudent();
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");
        //controler.getAllStudent();

        controler.createTeacher("a","b","c","1.02.1970");

        StudentGroup group = controler.createStudentGroup();
        controler.printStudentGroup(group); 
    }
}