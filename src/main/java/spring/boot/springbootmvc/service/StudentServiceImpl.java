package spring.boot.springbootmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.springbootmvc.dao.StudentRepository;
import spring.boot.springbootmvc.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository daoStudent;

    @Transactional
    @Override
    public Student getStudent(int id) {
        return daoStudent.findById(id).get();
    }

    @Transactional
    @Override
    public void removePerson(int id) {
        daoStudent.deleteById(id);
    }

    @Override
    @Transactional
    public void updatePerson(Student p) {
        //to do add isExist
        daoStudent.save(p);
    }

    @Transactional
    @Override
    public void createPerson(Student p) {
        daoStudent.save(p);
    }

    @Transactional
    @Override
    public Iterable<Student> getAllPerson() {
        return daoStudent.findAll();
    }
}