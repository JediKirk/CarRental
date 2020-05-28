package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.api.UserDetailsService;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class UserDetailsController {
    private final UserDetailsService userDetailsService;

    @GetMapping("/account-info")
    public String accountInfo(Model model, Principal principal) {
        model.addAttribute("userInfo", userDetailsService.findUserDetailsByPhoneNumber(principal.getName()));
        return "account-info";
    }
}