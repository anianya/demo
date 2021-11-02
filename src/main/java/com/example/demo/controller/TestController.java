package com.example.demo.controller;

import com.example.demo.pojo.Test;
import com.example.demo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    TestService testService;
    @GetMapping("/{id}")
    @ResponseBody
    public List<Test> findById(@PathVariable(value = "id") int id){
        return testService.findById(id);
    }
    @PostMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody(required = false) Test test){
        return testService.insert(test);
    }
    @GetMapping ("/de")
    @ResponseBody
    public int delete(@RequestParam(required = true) int id){
      return testService.delete(id);
    }
    @GetMapping("/sAll")
    @ResponseBody
    public List<Test> selectAll(){
        return  testService.selectAll();
    }
    @PostMapping("/update")
    @ResponseBody
    public int update(@RequestBody(required = false) Test test){
        return testService.update(test.getId());
    }
}
