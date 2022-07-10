package com.example.controller;

import com.example.model.ReportModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.mapper.ReportMapper;

import java.util.List;

@Controller
public class ReportController {
    @Autowired
    ReportMapper reportMapper;

    // 获取自己制作的报表list
    @ResponseBody
    @GetMapping("/report/list")
    public List<ReportModel> selectIdAndName(){
        List<ReportModel> list;
        list = reportMapper.selectIdAndName();
        if (list.isEmpty()) throw new RuntimeException("没有查询到报表名称和ID");
        return list;
    }

    // 视图重定向 - 跳转
    @GetMapping("*")
    public String index() {
        return "/jmreport/list";
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
