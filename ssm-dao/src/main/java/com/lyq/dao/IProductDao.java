package com.lyq.dao;

import com.lyq.domain.Product;

import java.util.List;

public interface IProductDao {
    public List<Product> findAll();
}
