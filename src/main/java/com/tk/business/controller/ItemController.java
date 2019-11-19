package com.tk.business.controller;

import com.tk.business.entity.Item;
import com.tk.business.service.ItemService;
import com.tk.business.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wl
 * @create 2019/11/19
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public Result newItem(Item item){
        itemService.newItem(item);
        return Result.success();
    }
}
