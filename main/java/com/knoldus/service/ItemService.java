package com.knoldus.service;

import com.knoldus.entity.Items;
import com.knoldus.repo.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }
    public Items insertTopNotchBrandIntoDatabase(Items items){
        System.out.println("enter in the method");
        items.setId(items.getId());
        items.setName(items.getName());
        System.out.println("the value of items:" +items);
        return itemRepository.save(items);
    }
    public List<Items> readData(){
      return itemRepository.findAll();
    }
}
