package com.example.demo.mapper.first;

import com.example.demo.bean.VExamOrgan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VExamOrganTagMapper {
    public List<VExamOrgan> getVExamOrganList();

    int insertVExamOrgan(VExamOrgan vexam);

    public Integer checkApplyId(String applyID);

    public Integer checkVEApplyId(String applyID);

    void deleteByApplyId(String applyID);
}
