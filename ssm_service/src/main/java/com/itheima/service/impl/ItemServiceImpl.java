package com.itheima.service.impl;

import com.itheima.dao.ItemDao;
import com.itheima.pojo.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    public void save(Item item) {
        itemDao.save(item);
    }

    public List<Item> findAll() {
        List<Item> itemList = itemDao.findAll();
        return itemList;
    }
}
