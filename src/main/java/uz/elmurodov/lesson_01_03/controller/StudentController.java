package uz.elmurodov.lesson_01_03.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.elmurodov.lesson_01_03.dtos.student.StudentCreateDto;
import uz.elmurodov.lesson_01_03.models.Student;
import uz.elmurodov.lesson_01_03.service.StudentService;

/**
 * @author Saydali Murodullayev, Wed 12:43 PM. 3/2/2022
 */
@RestController
@RequestMapping("student/*")
public class StudentController {

    final
    StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("add")
    public HttpEntity<String> createStudent(@RequestBody StudentCreateDto dto) {
        String s = service.create(dto);
        return ResponseEntity.ok(s);
    }

    @GetMapping("get/{id}")
    public HttpEntity<Student> getStudent(@PathVariable String id) {
        try {
            Student student = service.getStudent(id);
            return ResponseEntity.ok(student);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public HttpEntity<?> deleteStudent(@PathVariable String id) {
        try {
            service.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}
