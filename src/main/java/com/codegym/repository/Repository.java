package com.codegym.repository;

import com.codegym.model.Blog;

import java.util.List;

public interface Repository {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void delete(Long id);
}
