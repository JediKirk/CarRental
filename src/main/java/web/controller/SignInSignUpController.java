package web.controller;

import dao.repository.model.UserDetailsDto;
import dao.repository.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.api.RegistrationService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class SignInSignUpController {

    private final RegistrationService registrationService;


    @PostMapping("/sign-up")
    public String singUp(@ModelAttribute UserDto userDto, HttpSession httpSession) {
        registrationService.registration(userDto);
        httpSession.setAttribute("phoneNumber", userDto.getPhoneNumber());
        return "redirect:http://localhost:8080/CarRental_war_exploded/full-sign-up";
    }

    @PostMapping("/full-sign-up")
    public String fullSignUp(@ModelAttribute UserDetailsDto userDetailsDto, HttpSession httpSession) {
        userDetailsDto.setPhoneNumber(Long.parseLong(String.valueOf(httpSession.getAttribute("phoneNumber"))));
        registrationService.registrationDetails(userDetailsDto);
        return "redirect:http://localhost:8080/CarRental_war_exploded/";
    }
    @PostMapping("/sign-in")
    public String singIn(@ModelAttribute UserDto userDto, HttpSession httpSession) {

        return "redirect:http://localhost:8080/CarRental_war_exploded/";
    }



}