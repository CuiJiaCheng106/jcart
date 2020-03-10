package jcart.administration.back.cjc.dao;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.out.OrderListOutDTO;
import jcart.administration.back.cjc.po.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Page<OrderListOutDTO>search(@Param("orderId") Long orderId,
                                @Param("status") Byte status,
                                @Param("totalPrice") Double totalPrice,
                                @Param("customerName") String customerName,
                                @Param("startTime") Date startTime,
                                @Param("endTime") Date endTime);
}