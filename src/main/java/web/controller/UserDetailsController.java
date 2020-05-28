package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.api.UserDetailsService;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Optional;


@Controller
@RequiredArgsConstructor
public class UserDetailsController {
    private final UserDetailsService userDetailsService;

    @GetMapping("/account-info")
    public String accountInfo(HttpSession httpSession, Model model, Principal principal) {

            model.addAttribute("userInfo", userDetailsService.findUserDetailsByPhoneNumber(principal.getName()));
            return "account-info";

    }
}