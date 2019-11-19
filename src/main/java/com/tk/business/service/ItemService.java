package com.tk.business.service;

import com.tk.business.entity.Item;
import com.tk.business.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wl
 * @create 2019/11/19
 */
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public void newItem(Item item){
        itemRepository.save(item);
    }

    public void deleteItem(long id){
        itemRepository.deleteById(id);
    }

    public void updateItem(Item item){
        itemRepository.save(item);
    }

    public Item getItem(long id){
        return itemRepository.getOne(id);
    }
}
