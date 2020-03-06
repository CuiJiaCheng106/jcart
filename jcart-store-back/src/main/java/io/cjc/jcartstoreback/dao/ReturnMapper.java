package io.cjc.jcartstoreback.dao;

import io.cjc.jcartstoreback.po.Return;
import org.springframework.stereotype.Repository;


@Repository
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);


}