package com.itheima.dao;

import com.itheima.pojo.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
public class DaoTest {
    public static void main(String[] args){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemDao itemDao = (ItemDao) applicationContext.getBean("itemDao");
        List<Item> itemList = itemDao.findAll();
        for (Item item1 : itemList) {
            System.out.println(item1);
        }
    }
}
