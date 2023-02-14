package com.example.UniverSity_Mangement_System.service;

import com.example.UniverSity_Mangement_System.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static List<Student> students = new ArrayList<>();
    static {
        Student s1 = new Student(1,"sikandra","khan",23,"Civil");
        Student s2 = new Student(2,"surya","singh",26,"Mechanical");
        Student s3 = new Student(3,"hukam","singh",22,"CS");
        Student s4 = new Student(4,"abhishek","tandon",24,"Electrical");
        Student s5 = new Student(5,"vinay","tillore",25,"IT");
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
