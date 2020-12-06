package com.itheima.service;

import com.itheima.pojo.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemService itemService = (ItemService) applicationContext.getBean("itemServiceImpl");
        Item item = new Item();
        item.setName("鬼子指挥刀");
        item.setPrice(0.1f);
        item.setCreatetime(new Date());
        item.setPic("1.jpg");
        itemService.save(item);
        List<Item> itemList = itemService.findAll();
        for (Item item1 : itemList) {
            System.out.println(item1);
        }
    }
}
