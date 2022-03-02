package uz.elmurodov.lesson_01_03.db;

import com.google.common.collect.Lists;
import uz.elmurodov.lesson_01_03.models.Group;
import uz.elmurodov.lesson_01_03.models.Student;
import uz.elmurodov.lesson_01_03.models.Subject;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static final List<Student> STUDENTS = new ArrayList<>();
    public static final List<Group> GROUPS = Lists.newArrayList(
            new Group("BOOM"),
            new Group("B-4"),
            new Group("B-3")
    );
    public static final List<Subject> SUBJECTS = new ArrayList<>();
}
