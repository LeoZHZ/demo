package com.example.demo.mapper.thread;

import com.example.demo.bean.ExamBean;
import com.example.demo.bean.ImageBean;
import com.example.demo.bean.ServerBean;
import com.example.demo.bean.StoreBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 检查主记录
 *
 * @author Administrator
 */
@Mapper
public interface ExamMapper {


    /**
     * 只返回e_exams表的数据
     *
     * @param id
     * @return SELECT * FROM E_EXAMS
     */
    List<ExamBean> select(String patNo,String eClass,String wrId);

    /**
     * 返回studyID
     */
    String getStudyIdByExamId(String examId);

    StoreBean getStudyIdByExamId2(String examId);
    ServerBean selectServerByServerId(String serverId);

    List<ImageBean> selectImageByStudyId(ImageBean image);

}
