package vn.edu.vnu.java.prac04less25.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.vnu.java.prac04less25.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}