package com.majorbit.springboot_tre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    @GetMapping("/{id}")
    public Object readTask(@PathVariable int id) {
        Task t = service.readTask(id);
        if (t!=null) {
            return t;
        } else {
            return "Task non esistente";
        }
    }
    @PutMapping("/{id}")
    public String updateTask(@PathVariable int id, @RequestBody Task t) {
        return service.updateTask(id, t);
    }
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return service.deleteTask(id);
    }
}
