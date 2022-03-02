package uz.elmurodov.lesson_01_03.service;

import org.springframework.stereotype.Service;
import uz.elmurodov.lesson_01_03.dtos.student.StudentCreateDto;
import uz.elmurodov.lesson_01_03.models.Student;

import java.util.Optional;
import java.util.UUID;

import static uz.elmurodov.lesson_01_03.db.DataBase.STUDENTS;

/**
 * @author Saydali Murodullayev, Wed 12:43 PM. 3/2/2022
 */

@Service
public class StudentService {

    public String create(StudentCreateDto dto) {
        Student student = new Student(dto.getName(), dto.getGroupId());
        student.setId(UUID.randomUUID().toString());
        STUDENTS.add(student);
        return student.getId();
    }

    public Student getStudent(String id) {
        Optional<Student> first = STUDENTS.stream().filter(student -> student.getId().equals(id)).findFirst();
        return first.orElseThrow();
    }

    public void delete(String id) {
        STUDENTS.removeIf(student -> student.getId().equals(id));

    }
}
