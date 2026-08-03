package com.practice.dao.interfaces;

import com.practice.model.Employee;
import com.practice.model.User;

import java.util.List;

public interface ProjectDAO {
    List<Employee> getEmployees();
    List<User> getUsers();
}