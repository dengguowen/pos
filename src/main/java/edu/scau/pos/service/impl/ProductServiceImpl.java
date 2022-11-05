package edu.scau.pos.service.impl;

import edu.scau.pos.domain.ProductDescription;
import edu.scau.pos.mapper.ProductCatalog;
import edu.scau.pos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductCatalog productCatalog;
    @Override
    public ProductDescription getProductBySn(String productSn) {
        return productCatalog.getProductBySn(productSn);
    }

    @Override
    public List<ProductDescription> listAllProduct() {
        return productCatalog.listAllProduct();
    }
}
