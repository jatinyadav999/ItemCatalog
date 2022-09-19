package com.knoldus.controller;

import com.knoldus.entity.Items;
import com.knoldus.service.ItemService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
    private final ItemService itemService;

    public ItemsController(ItemService itemService){
        this.itemService = itemService;
    }
    @PostMapping("/add")
    public ResponseEntity<Items> insertTopNotchBrandIntoDatabase(@RequestBody Items items){
       Items extractItems = itemService.insertTopNotchBrandIntoDatabase(items);
       return  new ResponseEntity<Items>(extractItems ,new HttpHeaders() , HttpStatus.OK);
    }
    @GetMapping("/fetch")
    public ResponseEntity<List<Items>> readData(){
        return new ResponseEntity<List<Items>>(itemService.readData(),new HttpHeaders() ,HttpStatus.OK);
    }
}
