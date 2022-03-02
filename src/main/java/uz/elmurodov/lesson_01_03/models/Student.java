package uz.elmurodov.lesson_01_03.models;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Saydali Murodullayev, Wed 12:42 PM. 3/2/2022
 */
@Getter
@Setter
public class Student {

    private String id;

    private String name;

    private Long groupId;

    public Student() {
    }

    public Student(String name, Long groupId) {
        this.name = name;
        this.groupId = groupId;
    }
}
