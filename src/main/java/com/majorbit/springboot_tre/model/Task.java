package com.majorbit.springboot_tre.model;

import java.util.Date;

public class Task {

  private int id;
  private String title;
  private String description;
  private Date dueDate;
  private boolean completed;

  public Task(int id, String title, String description, Date dueDate, boolean completed) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.dueDate = dueDate;
    this.completed = completed;
  }

  public Task() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public java.util.Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(java.util.Date dueDate) {
    this.dueDate = dueDate;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
}