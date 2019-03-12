package com.example.springstudyhystrixdashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Miskai
 * @date 2019/3/12
 */
@Controller
public class DashBoard {
    /**
     * 去掉hystrix小尾巴
     * @return
     */
    @GetMapping("")
    public String index(){
        return "forward:/hystrix";
    }
}
