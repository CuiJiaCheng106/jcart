package jcart.administration.back.cjc.dto.in;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 15:13
 **/
public class OrderHistoryCreateInDTO {
    private  Long orderId;
    private  Byte orderStatus;
    private  String comment;
    private  Boolean customerNotified;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }
}
