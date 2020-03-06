package io.cjc.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.cjc.jcartstoreback.po.Return;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-06 17:17
 **/
public interface ReturnService {
    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);

}
