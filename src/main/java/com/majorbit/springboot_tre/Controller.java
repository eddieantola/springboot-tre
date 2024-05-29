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
    //injection del servizio di gestione delle task
    @Autowired
    private TaskService service;
    //metodo per inviare il Task da aggiungere al servizio di gestione
    @PostMapping
    public String createTask(@RequestBody Task t) {
        return service.createTask(t);
    }
    //metodo per inviare al servizio l'id del task da vissualizzare
    @GetMapping("/{id}")
    public Object readTask(@PathVariable int id) { 
    //tipo di ritorno Object per gestire l'assenza del task con il ritorno di un messaggio
        Task t = service.readTask(id);
        if (t!=null) {
            return t;
        } else {
            return "Task non esistente";
        }
    }
    //metodo per inviare al servizio l'id del task da modificare e un nuovo task da sostuire ad esso
    @PutMapping("/{id}")
    public String updateTask(@PathVariable int id, @RequestBody Task t) {
        return service.updateTask(id, t);
    }
    //metodo per inviare al servizio di gestione l'id del task da eliminare
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return service.deleteTask(id);
    }
}
