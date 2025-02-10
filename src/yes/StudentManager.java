package yes;

import java.util.List;

public class StudentManager {
    private static StudentManager instance;
    List<Student> studentList;
    StudentDBIO studentDBIO;

    private StudentManager(){}

    public static StudentManager getinstance(){
        if(instance == null){
            instance = new StudentManager();
        }
        return instance;
    }


}
