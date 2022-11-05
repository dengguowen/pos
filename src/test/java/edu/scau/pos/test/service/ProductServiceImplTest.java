package edu.scau.pos.test.service;

import edu.scau.pos.domain.ProductDescription;
import edu.scau.pos.service.IProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 邓国文
 * @version 1.0
 */
@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    private IProductService productService;

    @Test
    void getProductBySn() {
        ProductDescription p = productService.getProductBySn("1001");
//        System.out.println(p);
        Assertions.assertEquals(1l,p.getProductId(),"SN查找product失败");
    }

    @Test
    void listAllProduct() {
        List<ProductDescription> products = productService.listAllProduct();
        Assertions.assertTrue(products.size()==6);
    }
}