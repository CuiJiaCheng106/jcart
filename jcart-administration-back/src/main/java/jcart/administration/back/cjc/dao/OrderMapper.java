package jcart.administration.back.cjc.dao;

import com.github.pagehelper.Page;
import jcart.administration.back.cjc.dto.out.OrderListOutDTO;
import jcart.administration.back.cjc.po.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Page<OrderListOutDTO>search();
}