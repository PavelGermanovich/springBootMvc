package spring.boot.springbootmvc.service;

import spring.boot.springbootmvc.entity.Student;

public interface StudentService {
    Student getStudent(int id);
    void removePerson(int id);
    void updatePerson(Student p);
    void createPerson(Student p);
    Iterable<Student> getAllPerson();
}
