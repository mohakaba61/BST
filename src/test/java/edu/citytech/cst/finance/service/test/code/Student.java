package edu.citytech.cst.finance.service.test.code;

public class Student implements Comparable<Student>{
    private String studentID;
    private float gpa;

    public Student(String studentID, float gpa) {
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare( this.gpa, o.gpa)* -1;
    }
}
