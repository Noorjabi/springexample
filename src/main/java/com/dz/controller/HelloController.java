package com.dz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String helloPrint (ModelMap modelMap){
        modelMap.addAttribute( "message","hello ! this is spring framework");
        return "hello";
    }
}
