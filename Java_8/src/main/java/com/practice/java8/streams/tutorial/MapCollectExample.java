package com.practice.java8.streams.tutorial;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;
import com.practice.model.User;
import com.practice.model.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapCollectExample {

    private static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {

        List<User> users = projectDAO.getUsers();
        List<UserDTO> usersDTO = new ArrayList<>();
        // Normal method
        for(User user : users) {
            usersDTO.add(new UserDTO(user.getId(), user.getUsername(), user.getEmail()));
        }
        usersDTO.forEach(System.out::println);

        System.out.println("**************");
        // Using Map and collect method
        List<UserDTO> usersDTO1 = new ArrayList<>();
        usersDTO1 = users.stream()
                .map((user) -> new UserDTO(user.getId(), user.getUsername(), user.getEmail()))
                .collect(Collectors.toList());

        usersDTO1.forEach(System.out::println);
    }
}
