package com.example.demo.mapper.first;


import com.example.demo.bean.JiXiaoBean;
import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
/**
 * JiXiaoStatisticsMapper
 *
 * @author 007
 * @date 2018年8月20日
 * @Description 科室字典
 */
public interface JiXiaoStatisticsMapper {


    /**
     * 获取科室下的人
     *
     * @param deptName 科室代码
     * @return List<用户>
     * <p>
     */
    List<UserBean> getDeptUsers(@Param("deptName") String deptName);

    /*超声*/
    List<JiXiaoBean> getPreliminaryReportUS(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("reportName") String reportName);

    JiXiaoBean getVerifierReportUS(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("reportName") String reportName, @Param("examSource") String examSource);

    /*放射*/
    List<JiXiaoBean> getCheckNumberFS(@Param("time") String time, @Param("reportName") String reportName);

    List<JiXiaoBean> getPreliminaryReportFS(@Param("startTime") String startTime, @Param("endTime") String endTime,@Param("reportName") String reportName);

    JiXiaoBean getPreliminaryReportFSByItemNameAndSource(@Param("time") String time, @Param("reportName") String reportName, @Param("examSource") String examSource);

    JiXiaoBean getVerifierReportFS(@Param("time") String time, @Param("reportName") String reportName, @Param("examSource") String examSource);

    List<JiXiaoBean> getJustVerifierReportFS(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("reportName") String reportName);

    /*插入绩效表*/
    void inertJiXiaoStatisticsList(List<JiXiaoBean> list);

    /*插入绩效表*/
    void inertJiXiaoStatistics(JiXiaoBean jiXiaoBean);

    JiXiaoBean selectJiXiaoStatisticsOne(JiXiaoBean jiXiaoBean);

    void updateJiXiaoStaticsByOne(JiXiaoBean jiXiaoBean);


    /*
     * 统计整个类型的检查人次和项目数量
     * */
    List<JiXiaoBean> selectJSStatistics(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("examClass") String examClass);
}
