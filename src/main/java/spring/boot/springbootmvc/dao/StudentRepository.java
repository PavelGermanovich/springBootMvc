package spring.boot.springbootmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.springbootmvc.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
