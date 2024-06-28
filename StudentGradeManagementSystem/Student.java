package StudentGradeManagementSystem;

public class Student {
    private String studentID;
    private String studentName;
    private double grade;

    String getStudentID(){
        return studentID;
    }
    void setStudentID(String studentID){
        this.studentID=studentID;
    }
    String getStudentName(){
        return studentName;
    }
    void setStudentName(String studentName){
        this.studentName=studentName;
    }
    double getGrade(){
        return grade;
    }
    void setGrade(double grade){
        this.grade=grade;
    }
}
