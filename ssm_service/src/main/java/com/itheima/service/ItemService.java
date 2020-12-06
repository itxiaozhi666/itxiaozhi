package com.itheima.service;

import com.itheima.pojo.Item;

import java.util.List;

public interface ItemService {
    void save(Item item);
    List<Item> findAll();
}
