package com.majorbit.springboot_tre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majorbit.springboot_tre.model.Task;
import com.majorbit.springboot_tre.model.dao.DAOTask;

@Service
public class TaskService {

  //injection della repository delle task
  @Autowired
  private DAOTask dao;

  //metodo per passare alla repository il task da aggiungere
  public String createTask(Task t) {
    int r = dao.createTask(t);
    if (r>0) {
      return "Task creato con successo";
    } else {
      return "Ops, qualcosa è andato storto!";
    }
  }

  //metodo per passare alla repository l'id per il recupero del task richiesto 
  public Task readTask(int id) {
    return dao.readTask(id);
  }

  //metodo per passare alla repository l'id del task da modificare e un nuovo task da sostuire ad esso
  public String updateTask(int id, Task t) {
    int r = dao.updateTask(id, t);
    if (r>0) {
      return "Task aggiornato con successo";
    } else {
      return "Ops, qualcosa è andato storto!";
    }
  }

  //metodo per passare alla repository l'id del task da eliminare
  public String deleteTask(int id) {
    int r = dao.deleteTask(id);
    if (r>0) {
      return "Task eliminato con successo";
    } else {
      return "Ops, qualcosa è andato storto!";
    }
  }
}
