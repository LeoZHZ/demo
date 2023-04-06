package com.example.demo.mapper.second;

import com.example.demo.bean.TjzxBean;
import com.example.demo.bean.VExam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface VExamMapper {
    public List<TjzxBean> getVExamList();


}
