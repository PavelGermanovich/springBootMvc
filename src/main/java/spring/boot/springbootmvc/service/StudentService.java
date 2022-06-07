package spring.boot.springbootmvc.service;

import spring.boot.springbootmvc.entity.Student;

import java.util.List;

public interface StudentService {
    Student getStudent(int id);
    void removePerson(int id);
    void updatePerson(Student p);
    void createPerson(Student p);
    List<Student> getAllPerson();
}
