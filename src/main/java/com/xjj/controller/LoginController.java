package com.xjj.controller;

import com.xjj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("/login")
//@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/gologin/{id}",method = RequestMethod.GET)
    public ModelAndView gotoLoginJSP(HttpServletRequest request, HttpServletResponse response, @PathVariable String id){
        System.out.println("id == " + id);
        ModelAndView mdv = new ModelAndView();
        mdv.addObject("","");
        mdv.setViewName("jsp/login");
        return mdv;
    }


}
