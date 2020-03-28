package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chengchun
 * @date 2020/3/28 - 16:04
 */
@Controller
public class MyFirstController {

    @RequestMapping("/hello")
    public  String  myFirst(){
        System.out.println("ddddddd");
        return  "success";
    }
}
