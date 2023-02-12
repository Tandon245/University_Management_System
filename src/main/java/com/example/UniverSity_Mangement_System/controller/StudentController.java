package com.example.UniverSity_Mangement_System.controller;

import com.example.UniverSity_Mangement_System.model.Student;
import com.example.UniverSity_Mangement_System.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/UMS-Student")
public class StudentController {
private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("find-all-students")
public List<Student> findAllStudents(){
        return studentService.findAll();
}

@PostMapping("add-student")
    public void addStudent(@RequestBody Student student){
studentService.addStudent(student);
}
@DeleteMapping("Delete-Student/id/{id}")
    public  void deletestudent(@PathVariable int id){
studentService.deleteStudent(id);
}
@PutMapping("update-student/id/{id}")
public void updateStudent(@PathVariable int id,@RequestBody Student student ){
studentService.updateStudent(id,student);
}

@GetMapping("find-student/id/{id}")
    public Student findBystudentId(@PathVariable int id){
return  studentService.findByStudentId(id);
}
}
