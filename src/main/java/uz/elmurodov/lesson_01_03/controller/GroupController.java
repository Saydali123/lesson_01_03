package uz.elmurodov.lesson_01_03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.elmurodov.lesson_01_03.models.Group;
import uz.elmurodov.lesson_01_03.service.GroupService;

import java.util.List;

@RestController
@RequestMapping("/group/*")
public class GroupController {
    private final GroupService service;

    public GroupController(GroupService service) {
        this.service = service;
    }

    @GetMapping("all/")
    public List<Group> getGroups() {
        return service.getAll();
    }

    @GetMapping("{id}/")
    public Group get(@PathVariable String id) {
        return service.get(id);
    }
}
