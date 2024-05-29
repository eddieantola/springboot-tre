package com.majorbit.springboot_tre;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }
    @PostMapping("/create")
    public String createResource(@RequestBody String data) {
        return "Resource created: " + data;
    }
    @PutMapping("/update")
    public String updateResource(@RequestBody String data) {
        return "Resource updated: " + data;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteResource(@PathVariable Long id) {
        return "Resource deleted with ID: " + id;
    }

}
