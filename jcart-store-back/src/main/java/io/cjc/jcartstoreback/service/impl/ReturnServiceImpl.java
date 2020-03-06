package io.cjc.jcartstoreback.service.impl;

import io.cjc.jcartstoreback.dao.ReturnMapper;
import io.cjc.jcartstoreback.po.Return;
import io.cjc.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-06 17:18
 **/
@Service
public class ReturnServiceImpl  implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer create(Return aReturn) {
        returnMapper.insertSelective(aReturn);
        Integer returnId = aReturn.getReturnId();
        return returnId;
    }
}
