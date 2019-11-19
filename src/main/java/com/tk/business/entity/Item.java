package com.tk.business.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wl
 * @create 2019/11/19
 */
@Data
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(generator="customGenerationId")
    @GenericGenerator(name="customGenerationId", strategy="com.tk.business.config.CustomGenerationId")
    private Long id;

    private String name;
    private String imgUrl;
    private Double price;
    private String tag1;
    private String tag2;
    private Integer state;
}
