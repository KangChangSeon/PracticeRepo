package yes;

import java.util.List;

public class StudentManager extends StudentDBIO{
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


    @Override
    public List<String> saveStudntData() {
        return List.of();
    }

    @Override
    public List<String> getStudntData() {
        return List.of();
    }

    @Override
    public List<String> searchStudnt(String keyword) {
        return List.of();
    }

    @Override
    public List<String> sortStuByIdAsce() {
        return List.of();
    }

    @Override
    public List<String> sortStuByIdDesc() {
        return List.of();
    }

    @Override
    public List<String> sortStuByAverage() {
        return List.of();
    }

    @Override
    public List<String> SortStuByGradeDesc() {
        return List.of();
    }

    @Override
    public List<String> SortStuByScoreDesc() {
        return List.of();
    }

    @Override
    public Student inputstuData() {
        Student student = new Student.StudentBuilder().build();// 학생객체 생성 후 빌더를 호출
        String stringsKorean = Integer.toString(student.getKorean());
        String stringEnglish = Integer.toString(student.getEnglish());
        String stringMath = Integer.toString(student.getMath());
        String stringScience = Integer.toString(student.getScience());
        String stringTotal = Integer.toString(student.getTotal());
        String stringAverage = Double.toString(student.getAverage());
        String stringGrade = Character.toString(student.getGrade()); // Sting타입이 아닌 모든 필드 String으로 변환
        return student;
    }

    @Override
    public List<String> printStudentDta(Student student) {
        return List.of();
    }

    @Override
    public String printStudentbyName(Student name) {
        return "";
    }

    @Override
    public String printAllStudent(List<Student> students) {
        return "";
    }
}
