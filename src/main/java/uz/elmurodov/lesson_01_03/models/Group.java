package uz.elmurodov.lesson_01_03.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

/**
 * @author Saydali Murodullayev, Wed 12:50 PM. 3/2/2022
 */

@Getter
@Setter
public class Group {
    private String id;

    private String name;

    private List<Subject> subjectList;

    public Group() {
        this.id = UUID.randomUUID().toString();
    }

    public Group(String name) {
        this();
        this.name = name;
    }

    public Group(String name, List<Subject> subjectList) {
        this(name);
        this.subjectList = subjectList;
    }
}
