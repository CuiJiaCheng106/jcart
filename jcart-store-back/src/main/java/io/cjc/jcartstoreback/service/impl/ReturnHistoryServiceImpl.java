package io.cjc.jcartstoreback.service.impl;

import io.cjc.jcartstoreback.dao.ReturnHistoryMapper;
import io.cjc.jcartstoreback.dao.ReturnMapper;
import io.cjc.jcartstoreback.po.ReturnHistory;
import io.cjc.jcartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-06 17:41
 **/
@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);
        return returnHistories;
    }
}
