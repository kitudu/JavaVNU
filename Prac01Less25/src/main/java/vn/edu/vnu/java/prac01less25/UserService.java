package vn.edu.vnu.java.prac01less25;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    Optional<User> findByUsername(String username);
    List<User> findAll();
}
