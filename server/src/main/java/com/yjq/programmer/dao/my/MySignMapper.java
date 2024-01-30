package com.yjq.programmer.dao.my;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author yue
 */
public interface MySignMapper {

    // 根据时间范围获取报名人数
    Integer getSignTotalByDate(@Param("queryMap") Map<String, Object> queryMap);
}
