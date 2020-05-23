package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JspController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomePage() {
        return "sign-up";
    }

    @RequestMapping(value = "/sign-up", method = RequestMethod.GET)
    public String signUp() {
        return "sign-up";
    }

    @RequestMapping(value = "/sign-in", method = RequestMethod.GET)
    public String signInPage() {
        return "sign-in";
    }

    @RequestMapping(value = "/full-sign-up", method = RequestMethod.GET)
    public String fullSignUp() {
        return "full-sign-up";
    }
}