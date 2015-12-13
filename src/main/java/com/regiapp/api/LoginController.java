package com.regiapp.api;

import com.regiapp.model.LoginUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yihanlu on 13/12/2015.
 */
@RestController
public class LoginController {

    private String email;


    @RequestMapping(value="/api/validation", method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView sendValidation(@RequestParam String inputEmail, RedirectAttributes redirectAttributes){
        ModelAndView model = new ModelAndView("redirect:/validation_sent.html");
        model.addObject("email", inputEmail);
        email = inputEmail;

        return model;
    }

    @RequestMapping(value="validation_sent.html", method = RequestMethod.GET)
    public ModelAndView sendSuccess(Map<String, Object> context){
        context.put("email", "hello");
        return new ModelAndView(new RedirectView("validation_sent.jsp"), context);
    }

}
