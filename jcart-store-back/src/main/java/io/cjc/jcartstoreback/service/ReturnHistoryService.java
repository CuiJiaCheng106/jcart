package io.cjc.jcartstoreback.service;

import io.cjc.jcartstoreback.po.ReturnHistory;

import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-06 17:40
 **/
public interface ReturnHistoryService {
    List<ReturnHistory> getByReturnId(Integer returnId);
}
