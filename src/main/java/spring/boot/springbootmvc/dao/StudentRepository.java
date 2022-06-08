package spring.boot.springbootmvc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.boot.springbootmvc.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
