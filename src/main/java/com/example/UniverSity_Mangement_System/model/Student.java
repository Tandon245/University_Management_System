package com.example.UniverSity_Mangement_System.model;

public class Student {

    private int StudentId;
    private  String FirstName ;
    private  String LastName;
    private  int Age;
    private  String Department;

    public Student(int StudentId, String FirstName, String LastName, int Age, String Department) {
        this.StudentId = StudentId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Department = Department;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                ", Department='" + Department + '\'' +
                '}';
    }
}
