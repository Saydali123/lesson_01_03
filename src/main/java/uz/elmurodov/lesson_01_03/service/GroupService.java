package uz.elmurodov.lesson_01_03.service;

import org.springframework.stereotype.Service;
import uz.elmurodov.lesson_01_03.db.DataBase;
import uz.elmurodov.lesson_01_03.models.Group;

import java.util.List;

@Service
public class GroupService {
    public List<Group> getAll() {
        return DataBase.GROUPS;
    }

    public Group get(String id) {
        return DataBase.GROUPS.stream().filter(group -> group.getId().equals(id)).findFirst().
                orElseThrow(() -> new RuntimeException("Group not found"));
    }
}
