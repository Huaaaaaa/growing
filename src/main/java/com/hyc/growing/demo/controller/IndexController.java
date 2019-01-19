package com.hyc.growing.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description
 * @Author huayingcao2
 * @Date 2019/1/19  16:14
 */


@RestController
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "hello";
    }
}
