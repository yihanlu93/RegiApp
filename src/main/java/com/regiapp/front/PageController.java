package com.regiapp.front;

import com.regiapp.model.ValidationEmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by yihanlu on 13/12/2015.
 */
@Controller
public class PageController {
    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getLoginPage(ModelMap model){
        model.addAttribute("result1", "hello");
        return "/index.jsp";
    }

    @RequestMapping(value = "/validation.html")
    public String getValidationPage(){
        return "/validation.jsp";
    }

    @RequestMapping(value = "/submitForm.html")
    public String sendValidationEmail(){
        return "/api/validation";
    }


}
