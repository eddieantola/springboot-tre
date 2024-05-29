package com.majorbit.springboot_tre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majorbit.springboot_tre.model.Task;
import com.majorbit.springboot_tre.model.dao.DAOTask;

@Service
public class TaskService {

  @Autowired
  private DAOTask dao;

  public String createTask(Task t) {
    int r = dao.createTask(t);
    if (r>0) {
      return "Task creato con successo";
    } else {
      return "Ops, qualcosa è andato storto!";
    }
  }
  public Task readTask(int id) {
    return dao.readTask(id);
  }
  public String updateTask(int id, Task t) {
    int r = dao.updateTask(id, t);
    if (r>0) {
      return "Task aggiornato con successo";
    } else {
      return "Ops, qualcosa è andato storto!";
    }
  }
}
