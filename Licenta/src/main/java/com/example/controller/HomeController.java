package com.example.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * Created by sscutaru on 1/25/2017.
 */

@Controller
public class HomeController {

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
//    public String hello(HttpServletRequest request) {
//
//        return "templates/homepage";
//    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request, Model model) {

        return "homepage";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Principal principal) {
        return principal != null ? "homeSignedIn" : "homeNotSignedIn";
    }
}
