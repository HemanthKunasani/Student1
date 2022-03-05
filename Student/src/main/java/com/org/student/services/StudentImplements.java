package com.org.student.services;

import com.org.student.module.Student;
import com.org.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentImplements implements StudentInterface
{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void create(Student s)
    {
        studentRepository.save(s);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void update(Student s) {
        studentRepository.save(s);
    }

    @Override
    public void deleteById(Integer id) {
       studentRepository.deleteById(id);
    }
}
