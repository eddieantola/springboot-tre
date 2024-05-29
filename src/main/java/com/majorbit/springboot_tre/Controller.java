package com.majorbit.springboot_tre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.majorbit.springboot_tre.model.Task;

@RestController
@RequestMapping("/task")
public class Controller {

    @Autowired
    private TaskService service;
    @PostMapping
    public String createTask(@RequestBody Task t) {
        return service.createTask(t);
    }
}
