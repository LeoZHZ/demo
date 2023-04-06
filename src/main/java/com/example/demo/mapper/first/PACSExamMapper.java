package com.example.demo.mapper.first;

import com.example.demo.bean.ExamBean;
import com.example.demo.bean.ExamItemsBean;
import com.example.demo.bean.ExamPatientBean;
import com.example.demo.bean.ExamsBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * ExamMapper
 *
 * @author 007
 * @date 2018年8月20日
 * @Description
 */
@Mapper
public interface PACSExamMapper {
    int insertOneExams(ExamsBean examsBean);

    String getOneFlagByExamsApplyId(String applyId);


    public int insertExamsItemList(ExamItemsBean item);

    Integer getOneFlagByExamsItemsExamIdAndItemCode(@Param("examId") String examId, @Param("itemCode") String itemCode);

    public int insertOneExamsPatient(ExamPatientBean extity);

    Integer getOneFlagByExamsPatientPatId(String patId);

    Integer getItemSumByExamId(String examid);

    void insertOneVExams(ExamsBean examBean);

    Integer getOneFlagByVExamsByApplyId(String applyId);

    void insertOneHisInsertFlag(String xh);

    Integer getFLagHisInsertFlagByByApplyId(int xh);
}
