package com.example.springbootconfig.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String test(Map<String,Object> data)
    {
        data.put("hello","你好");
        ArrayList<String> list=new ArrayList<String>();
        list.add("hha");
        list.add("bbb");
        list.add("cc");
        data.put("list",list);
        return "success";
    }
}
