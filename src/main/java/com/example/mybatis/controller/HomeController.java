package com.example.mybatis.controller;

import com.example.mybatis.service.TestService;
import com.example.mybatis.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Autowired
    TestService testService;


    @RequestMapping(value = "/")
    public String tohome(){
        return "form";
    }

    @RequestMapping(value = "/test", method= RequestMethod.POST)
    public String test(String id, String pw, Model model){
        TestVO vo = new TestVO();
        vo.setId(id);
        vo.setPw(pw);
        model.addAttribute("vo",vo);

        testService.insertDb(vo);

        return "test_result";
    }

}
