package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.api.UserDetailsService;

import javax.servlet.http.HttpSession;
import java.util.Optional;


@Controller
@RequiredArgsConstructor
public class UserDetailsController {
    private final UserDetailsService userDetailsService;

    @GetMapping("/account-info")
    public String accountInfo(HttpSession httpSession, Model model) {
        Optional<Object> phoneNumber = Optional.ofNullable(httpSession.getAttribute("phoneNumber"));
        if (phoneNumber.isPresent()) {
            model.addAttribute("userInfo", userDetailsService.findUserDetailsByPhoneNumber(Long.parseLong(String.valueOf(httpSession.getAttribute("phoneNumber")))));
            return "account-info";
        } else {
            return "sign-in";
        }
    }
}