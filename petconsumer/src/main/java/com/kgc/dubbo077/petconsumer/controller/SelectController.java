package com.kgc.dubbo077.petconsumer.controller;

import com.kgc.dubbo077.petapi.pojo.Pet;
import com.kgc.dubbo077.petapi.service.SelectService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SelectController {
    @Reference
    SelectService selectService;
@RequestMapping("/")
    public String index(String type, Model model){
        List<Pet> pets = selectService.selectAll(type);
        model.addAttribute("pets",pets);
        return "index";
    }
}
