package com.org.student.controller;

import com.org.student.module.Student;
import com.org.student.services.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController
{
 @Autowired
 StudentInterface studentInterface;
 @PostMapping("/create")
 public void create(@RequestBody Student s)
 {
    studentInterface.create(s);
 }
@GetMapping()
 public List<Student> getAll()
{
 return studentInterface.getAll();
}
@PutMapping("/update")
 public void update(@RequestBody Student s)
{
 studentInterface.update(s);
}
@DeleteMapping("/deleteById/{Id}")
 public void deleteById(@RequestBody Integer id)
{
 studentInterface.deleteById(id);
}
}
