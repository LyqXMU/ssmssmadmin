package com.lyq.controller;

import com.lyq.domain.Product;
import com.lyq.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        System.out.println("findAll");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("product-list");
        List<Product> res = productService.findAll();
        System.out.println(res);
        mv.addObject("productList", res);
        return mv;
    }
}
