package org.example.controller;


import org.apache.dubbo.config.annotation.DubboReference;
import org.example.provider.SayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/say")
public class SayController {

    @DubboReference(version = "1.0.0", url = "dubbo://192.168.10.1:20880")
    private SayService sayService;

    @GetMapping(value = "/hi")
    public String hi() {
        String res = sayService.sayHi("香菜!!!");
        return res;
    }
}
