package io.cjc.jcartstoreback.mq;

import java.io.Serializable;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-23 18:53
 **/
public class HotProductDTO implements Serializable {
    private Integer productId;
    private String productCode;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
