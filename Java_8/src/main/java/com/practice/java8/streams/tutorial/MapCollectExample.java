package com.practice.java8.streams.tutorial;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;
import com.practice.model.User;

import java.util.List;

public class MapCollectExample {

    private static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {

        List<User> users = projectDAO.getUsers();

        users.forEach(System.out::println);

    }
}
