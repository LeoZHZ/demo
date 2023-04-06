package com.example.demo.mapper.first;


import com.example.demo.bean.DevicesStatisticsBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * JiXiaoStatisticsMapper
 *
 * @author 007
 * @date 2018年8月20日
 * @Description 科室字典
 */
@Mapper
public interface DevicesStatisticsMapper {
    /**
     * 获取指定日期的数据
     *
     * @param map
     * @return
     */
    List<DevicesStatisticsBean> getDayDevicesStatistics(@Param("map") Map<String, String> map);

    /**
     * 获取当天数据进行汇总
     *
     * @return
     */
    List<DevicesStatisticsBean> getReportDtDateFS(@Param("startTime") String startTime, @Param("endTime") String endTime);


    /**
     * 获取当天数据进行汇总
     *
     * @return
     */
    List<DevicesStatisticsBean> getReportDtDateUS(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 插入一条
     *
     * @param devicesStatisticsEntity
     * @param
     */
    void insertOne(DevicesStatisticsBean devicesStatisticsEntity);
}
