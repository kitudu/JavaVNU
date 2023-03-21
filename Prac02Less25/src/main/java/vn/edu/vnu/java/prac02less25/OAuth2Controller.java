package vn.edu.vnu.java.prac02less25;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OAuth2Controller {

    @GetMapping("/login/oauth2/code/google")
    public String handleGoogleCallback(@AuthenticationPrincipal OAuth2User user) {
        // Do something with the authenticated user
        return "redirect:/";
    }
}
