package com.example.demo.mapper;

import com.example.demo.pojo.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TestMapper {
    @Select("select * from test where id=#{id}")
    List<Test> findById(@Param("id") int id);
    @Insert("insert into test(id,name) value(#{id},#{name})")
    int insert(Test test);
    @Delete("delete from test where id=#{id}")
    int delete(@Param("id") int id);
    @Select("select * from test")
    List<Test> selectAll();
    @Update("update set name=#{name} where id=#{id}")
    int update(@Param("id") int id);

}
