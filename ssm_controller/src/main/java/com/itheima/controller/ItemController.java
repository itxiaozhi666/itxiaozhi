package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.service.ItemService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/save")
    public String save(Item item){
        itemService.save(item);
        return "redirect:/items/findAll";
    }
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Item> list = itemService.findAll();
        model.addAttribute("items",list);
        return "items";
    }
}
