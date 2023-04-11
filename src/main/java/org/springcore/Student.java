package org.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAdrress;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAdrress() {
        return studentAdrress;
    }

    public void setStudentAdrress(String studentAdrress) {
        this.studentAdrress = studentAdrress;
    }

    public Student(int studentId, String studentName, String studentAdrress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAdrress = studentAdrress;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAdrress='" + studentAdrress + '\'' +
                '}';
    }
}
