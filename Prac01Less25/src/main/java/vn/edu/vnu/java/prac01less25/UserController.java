package vn.edu.vnu.java.prac01less25;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "signup";
        }

        Optional<User> existingUser = userService.findByUsername(user.getUsername());
        if (existingUser.isPresent()) {
            model.addAttribute("error", "Username already exists");
            return "signup";
        }

        userService.save(user);

        return "redirect:/login";
    }
}
