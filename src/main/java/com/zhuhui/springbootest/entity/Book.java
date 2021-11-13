package com.zhuhui.springbootest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//book类就和book表完成了绑定（表名和类名的映射关系）
@Data//lombokd的注解，会帮助我们生成各种各样的get set方法
public class Book {
    //属性的对应
    @Id
    private Integer id;
    private String name;
    private String author;
}
