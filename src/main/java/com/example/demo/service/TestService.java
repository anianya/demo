package com.example.demo.service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.Test;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    TestMapper testMapper;
    public List<Test> findById(int id){
        return testMapper.findById(id);
    }
    public int insert(Test test){
        return testMapper.insert(test);
    }
    public int delete(int id){
        return testMapper.delete(id);
    }
    public List<Test> selectAll(){
        return testMapper.selectAll();
    }
    public int update(int id){
        return testMapper.update(id);
    }
}
