package com.example.UniverSity_Mangement_System.service;

import com.example.UniverSity_Mangement_System.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {
    private static List<Student> students=new ArrayList<>();
    static {
        Student s1=new Student(1,"Abhishek","Tandon",22,"Mechanical");
        Student s2=new Student(2,"Sikandra","Khan",23,"Civil");
        Student s3=new Student(3,"Surya","Singh",24,"Civil");
        Student s4=new Student(4,"Barkha","Rajput",22,"Computer Science");
        Student s5=new Student(5,"Ritika","Singh",22,"Agriculture");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
    }

    public  List<Student> findAll() {
        return students;
    }


    public  void addStudent(Student student){

        students.add(student);
    }

public void deleteStudent(int id){
        for(Student student:students){
            if(student.getStudentId()==id){
               students.remove(student);
            }
        }

}
    public void  updateStudent(int id,Student newStudent){
Student student =findByStudentId(id);
student.setStudentId(newStudent.getStudentId());
    }

    public  Student findByStudentId(int id){
for(Student student:students){
    if(student.getStudentId()==id){
        return student;
    }

}
return null;
    }


}
