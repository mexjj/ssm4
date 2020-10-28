package com.xjj.mapping;

import com.xjj.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginMapper {

    void save(Student student);

    boolean update(Student student);

    boolean delete(int id);

    Student findById(int id);

    List<Student> findAll();

    Student login(Student admin);

}
