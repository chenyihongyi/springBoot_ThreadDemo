package com.thread_demo.springBoot_ThreadDemo.annoations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Elvis Chen
 * @Date 2018/12/27 11:14
 * @Version 1.0
 **/
@Controller
@Slf4j
public class TestController {

    @RequestMapping
    @ResponseBody
    public String test() {
        return "test";
    }
}
