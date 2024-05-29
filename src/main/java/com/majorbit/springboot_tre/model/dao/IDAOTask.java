package com.majorbit.springboot_tre.model.dao;

import com.majorbit.springboot_tre.model.Task;

public interface IDAOTask {
  public int createTask(Task t);
  public Task readTask(int id);
  public int updateTask(int id, Task t);
}
