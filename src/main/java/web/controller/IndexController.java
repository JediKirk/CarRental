package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.api.CarService;
import service.api.UserDetailsService;
import service.api.UserService;

import javax.servlet.http.HttpSession;


@Controller
@RequiredArgsConstructor
public class IndexController {
    private final UserDetailsService userDetailsService;


    @GetMapping("/account-info")
    public String accountInfo(HttpSession httpSession, Model model) {
        model.addAttribute("userInfo",
                userDetailsService.findUserDetailsByPhoneNumber(Long.parseLong(String.valueOf(httpSession.getAttribute("phoneNumber")))));
        return "account-info";
    }

}