package com.majorbit.springboot_tre.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.majorbit.springboot_tre.model.Task;
@Repository
public class DAOTask implements IDAOTask {

  public int createTask(Task t) {
    Connection c = null;
    PreparedStatement p = null;
    int r=0;
    try {
      c = DB.getConnection();
      p = c.prepareStatement("INSERT INTO `Task` (title, description, dueDate, completed) VALUES (?, ?, ?, ?)");
      p.setString(1, t.getTitle());
      p.setString(2, t.getDescription());
      p.setDate(3, t.getDueDate());
      p.setBoolean(4, t.isCompleted());
      r=p.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        closeResources(c, p, null);
      }
    return r;
  }
  public Task readTask(int id) {
    Connection c = null;
    PreparedStatement p = null;
    ResultSet rs = null;
    Task t = null;
    try {
      c = DB.getConnection();
      p = c.prepareStatement("SELECT * from `Task` where id=?");
      p.setInt(1, id);
      rs=p.executeQuery();
      while (rs.next()) {
        t = new Task(rs.getInt("id"), rs.getString("title"),rs.getString("description"),rs.getDate("dueDate"),rs.getBoolean("completed"));
      }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        closeResources(c, p, rs);
      }
    return t;
  }

  private void closeResources(Connection c, PreparedStatement p, ResultSet rs) {
    try {
      if (rs != null) rs.close();
      if (p != null) p.close();
      if (c != null) c.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
