package com.tk.business.repository;

import com.tk.business.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wl
 * @create 2019/11/19
 */
public interface ItemRepository  extends JpaRepository<Item,Long> {

}
