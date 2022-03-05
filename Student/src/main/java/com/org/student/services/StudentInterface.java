package com.org.student.services;

import com.org.student.module.Student;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentInterface
{
    public void create(@RequestBody Student s);
    public List<Student> getAll();
    public void update(@RequestBody Student s);
    public void deleteById(@RequestBody Integer id);
}
