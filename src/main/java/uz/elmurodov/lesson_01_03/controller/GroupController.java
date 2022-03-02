package uz.elmurodov.lesson_01_03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.elmurodov.lesson_01_03.models.Group;

import java.util.List;

@RestController
@RequestMapping("/group/*")
public class GroupController {

    @GetMapping("get_all/")
    public List<Group> getGroups() {
        return null;
    }
}
