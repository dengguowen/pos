package edu.scau.pos.service;

import edu.scau.pos.domain.ProductDescription;

import java.util.List;

/**
 * 产品服务接口
 */
public interface IProductService {
    /**
     * 根据编号获取product对象
     * @param productSn
     * @return
     */
    public ProductDescription getProductBySn(String productSn);
    /**
     * 查询所有的product
     * @return
     */
    public List<ProductDescription> listAllProduct();
}
