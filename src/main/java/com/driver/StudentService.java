package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
@Autowired
    StudentRepository studentRepository;
    void addStudent(Student student){
         studentRepository.addStudent(student);
    }
    void addTeacher(Teacher teacher){
        studentRepository.addTeacher(teacher);
    }
    void studentTeacherPair(String student,String teacher){
        studentRepository.studentTeacherPair(student,teacher);
    }
    Student stbyN(String orderId){
        return studentRepository.stbyN(orderId);
    }
    Teacher tbyN(String teacher) {
        return studentRepository.tbyN(teacher);
    }
    List<String> ListOfStudent(String dpId){
        return studentRepository.ListOfStudent(dpId);
    }
    List<String> ListOfAllStudents(){
        return studentRepository.ListOfAllStudents();
    }
    void deleteTeacher(String id){
        studentRepository.deleteTeacher(id);
    }
    void DeleteAllTeachers(){
        studentRepository.DeleteAllTeachers();
    }
    }
