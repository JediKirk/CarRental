package web.controller;

import dao.repository.model.UserDetailsDto;
import dao.repository.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.api.UserDetailsService;
import service.api.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class SignInSignUpController {

    private final UserService userService;
    private final UserDetailsService userDetailsService;

    @PostMapping("/sign-up")
    public String singUp(@ModelAttribute UserDto userDto, HttpSession httpSession) {
        userService.registration(userDto);
        httpSession.setAttribute("phoneNumber", userDto.getPhoneNumber());
        return "redirect:http://localhost:8080/CarRental_war_exploded/full-sign-up";
    }

    @PostMapping("/full-sign-up")
    public String fullSignUp(@ModelAttribute UserDetailsDto userDetailsDto, HttpSession httpSession) {
        userDetailsDto.setPhoneNumber(Long.parseLong(String.valueOf(httpSession.getAttribute("phoneNumber"))));
        userDetailsService.registrationDetails(userDetailsDto);
        return "redirect:http://localhost:8080/CarRental_war_exploded/";
    }

    @PostMapping("/sign-in")
    public String singIn(@ModelAttribute UserDto userDto, HttpSession httpSession) {
        try {
            userService.signIn(userDto);
            httpSession.setAttribute("phoneNumber", userDto.getPassword());
            return "redirect:http://localhost:8080/CarRental_war_exploded/";
        } catch (RuntimeException e) {
            return "redirect:http://localhost:8080/CarRental_war_exploded/sign-up";
        }
    }


}