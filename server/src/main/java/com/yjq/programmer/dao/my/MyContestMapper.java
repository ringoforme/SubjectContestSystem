package com.yjq.programmer.dao.my;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author yue
 */
public interface MyContestMapper {

    // 根据时间范围获取竞赛个数
    Integer getContestTotalByDate(@Param("queryMap") Map<String, Object> queryMap);
}
