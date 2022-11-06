package edu.scau.pos.service.impl;

import edu.scau.pos.domain.ProductDescription;
//import edu.scau.pos.mapper.ProductCatalog;
import edu.scau.pos.mapper.ProductMapper;
import edu.scau.pos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;
//    private ProductCatalog productCatalog;
    @Override
    public ProductDescription getProductBySn(String productSn) {
        return productMapper.getProductBySn(productSn);
    }

    @Override
    public List<ProductDescription> listAllProduct() {
        return productMapper.listAllProduct();
    }
}
