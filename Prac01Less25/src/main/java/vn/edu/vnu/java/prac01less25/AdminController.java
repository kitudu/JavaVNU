package vn.edu.vnu.java.prac01less25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String showAdmin(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "admin";
    }
}
