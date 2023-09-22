package org.example;

public class Student extends Customer{
    public Student(String name) {
        super(name);
    }
    private long studentID;

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
}
