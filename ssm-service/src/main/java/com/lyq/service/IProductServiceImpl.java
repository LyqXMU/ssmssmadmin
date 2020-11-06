package com.lyq.service;

import com.lyq.dao.IProductDao;
import com.lyq.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao dao;
    @Override
    public List<Product> findAll() {
        return dao.findAll();
    }
}
