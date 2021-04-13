package com.spring.bo.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/home")
    public String home() {

        return "index.html";
    }

    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest(){

        String value = "테스트 String";
        return value;
    }

}
//Controller MVC 뷰 출력 가능 하지만 ResponseBody와 Mapping을 둘 다 사용하여야 원하는 데이터 출력하도록 설정 가능

