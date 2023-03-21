package vn.edu.vnu.java.prac01less25;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String showProfilePage(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "profile";
    }
}