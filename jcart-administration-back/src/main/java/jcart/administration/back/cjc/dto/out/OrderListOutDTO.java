package jcart.administration.back.cjc.dto.out;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 14:47
 **/
public class OrderListOutDTO {
    private Integer orderId;
    private  Integer customerId;
    private String customerName;
    private  Byte status;
    private Double totalPrice;
    @JsonIgnore
    private Date createTime;
    private Long createTimestamp;
    @JsonIgnore
    private Date updateTime;
    private Long updateTimestamp;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public OrderListOutDTO(Date createTime, Date updateTime) {
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getCreateTimestamp() {
        return this.createTime==null?null:this.createTime.getTime();
    }


    public Long getUpdateTimestamp() {
        return this.updateTime==null?null:this.updateTime.getTime();
    }

}
