package com.example.demo.mapper.first;

import com.example.demo.bean.TjzxBean;
import com.example.demo.bean.VExam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VSubExamMapper {

    void insertVSubExam(TjzxBean vexam);
    public  Integer checkESRApplyId(@Param("applyId") String applyId);
    public  Integer checkVEApplyId(String applyID);
    void deleteByExamId(String applyID);

    Integer checkSubApplyId( String subApplyId);
}
