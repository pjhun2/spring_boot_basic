package com.spring.bo.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRestController {


    @RequestMapping(value = "/testValue", method = RequestMethod.GET)
    public String getTestValue() {
        String TestValue = "테스트 컨트롤러 테스트";
        return TestValue;
    }

    @RequestMapping("/test")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name","pjhun");

        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        return mav;

    }
}

// RestController는 Controller와 달리 ResponseBody가 추가되어있음 그래서 Mapping을 사용하여도 메소드와 url두 개 지정이 다 가능하여 Controller보다 효율적으로 사용할 수 있음
