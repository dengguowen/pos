package edu.scau.pos.mapper;

import edu.scau.pos.domain.ProductDescription;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 邓国文
 * @version 1.0
 */
@Mapper
public interface ProductMapper {
    /**
     * 根据编号获取product对象
     * @param productSn
     * @return
     */
    @Select("SELECT product_id,product_sn,product_name FROM pos_product WHERE product_sn = #{productSn}")
    public ProductDescription getProductBySn(String productSn);
    /**
     * 查询所有的product
     * @return
     */
    @Select("SELECT product_id,product_sn,product_name FROM pos_product")
    public List<ProductDescription> listAllProduct();
}
