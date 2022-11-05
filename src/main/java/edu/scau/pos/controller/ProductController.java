package edu.scau.pos.controller;

import edu.scau.pos.core.domain.AjaxResult;
import edu.scau.pos.service.IProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService productService;
//    @Autowired
//    private Category category;
    @ApiOperation("根据SN找产品")
    @GetMapping("/{productSn}")
    public AjaxResult getBySn(@PathVariable("productSn") String productSn){
////        product=new ProductDescription();
//        product.setProductId(productId);
//        product.setProductName("钢笔");
//        product.setProductSn("#0304");
////        category=new Category();
//        category.setCategoryId(8L);
//        category.setCategoryName("文具");
//        product.setCategory(category);
//        product.setPrice(new BigDecimal(30.8));
        return AjaxResult.success(productService.getProductBySn(productSn));
    }
    @ApiOperation("列出所有产品")
    @GetMapping("listAll")
    public AjaxResult ListAllProduct(){
        return AjaxResult.success(productService.listAllProduct());
    }
}
