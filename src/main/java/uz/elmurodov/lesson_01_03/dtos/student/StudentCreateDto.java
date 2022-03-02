package uz.elmurodov.lesson_01_03.dtos.student;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Saydali Murodullayev, Wed 12:55 PM. 3/2/2022
 */
@Getter
@Setter
public class StudentCreateDto {
    private String name;
    private Long groupId;
}
