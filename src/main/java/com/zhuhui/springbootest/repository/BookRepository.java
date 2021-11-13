package com.zhuhui.springbootest.repository;

import com.zhuhui.springbootest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
