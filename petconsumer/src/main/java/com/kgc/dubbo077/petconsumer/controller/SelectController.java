package com.kgc.dubbo077.petconsumer.controller;

import com.kgc.dubbo077.petapi.pojo.Pet;
import com.kgc.dubbo077.petapi.service.SelectService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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
    @RequestMapping("/toadd")
    public String toadd(){
        return "add";
    }
    @RequestMapping("/doadd")
    public String doadd(Pet pet, HttpSession session){
        int i = selectService.add(pet);
        if(i>0){
            session.setAttribute("msg","添加成功！！！");
            return "redirect:/";
        }else {
            session.setAttribute("msg","添加失败！！！");
            return "redirect:/toadd";
        }
    }
    @RequestMapping("/delete")
    public String delete(Integer petId){
        int delete=selectService.delete(petId);
        return "redirect:/";
    }

}
