package com.lyq.controller;

import com.lyq.domain.Product;
import com.lyq.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping("/save.do")
    public String save(Product product) {
        System.out.println(product);
        productService.save(product);
        return "redirect:findAll.do";
    }
    @RequestMapping("/findAll.do")
    public String findAll(Map<String, Object> map) {
        System.out.println("findAll");
        List<Product> res = productService.findAll();
        System.out.println(res);
        map.put("productList", res);
        return "product-list";
    }
}
