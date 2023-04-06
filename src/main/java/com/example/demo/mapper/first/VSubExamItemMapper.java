package com.example.demo.mapper.first;

import com.example.demo.bean.VExamItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VSubExamItemMapper {

    int insertVExamItem(VExamItem vexam);
    public  Integer checkApplyId(String applyID);
    public  Integer checkVEApplyId(String applyID);
    void deleteByApplyID(String applyID);

}
