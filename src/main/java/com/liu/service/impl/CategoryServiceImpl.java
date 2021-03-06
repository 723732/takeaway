package com.liu.service.impl;

import com.liu.dataobject.ProductCategory;
import com.liu.repository.ProductCategoryRepository;
import com.liu.repository.ProductInfoRepository;
import com.liu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl  implements CategoryService {

    private ProductCategoryRepository repository;
    @Autowired
    public void setProductCategoryRepository (ProductCategoryRepository repository){
        this.repository = repository;
    }

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findById(categoryId).orElse(null);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
