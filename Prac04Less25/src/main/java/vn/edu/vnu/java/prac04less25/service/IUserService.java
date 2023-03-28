package vn.edu.vnu.java.prac04less25.service;

import vn.edu.vnu.java.prac04less25.entity.User;

import java.util.Optional;

public interface IUserService {

    Integer saveUser(User user);

    Optional<User> findByUsername(String username);
}
