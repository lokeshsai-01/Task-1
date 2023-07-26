package com.springexample.restdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection="students")
public class Structure {
    @Id
    private String studentID;
    private String studentName;
    private LocalDate studentDOB;
    private String studentBranch;
    private float studentGPA;

    public Structure() {
    }

    public Structure(String studentID, String studentName, LocalDate studentDOB, String studentBranch, float studentGPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentBranch = studentBranch;
        this.studentGPA = studentGPA;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(LocalDate studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public float getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(float studentGPA) {
        this.studentGPA = studentGPA;
    }
}
