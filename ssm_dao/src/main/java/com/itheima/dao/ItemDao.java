package com.itheima.dao;

import com.itheima.pojo.Item;

import java.util.List;

public interface ItemDao {
    void save(Item item);

    List<Item> findAll();
}
