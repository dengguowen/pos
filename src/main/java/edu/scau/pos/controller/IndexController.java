package edu.scau.pos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *符合Restful的控制器
 *
 */
@RestController
public class IndexController {
    /**
     * 接口
     * @return
     */
    @GetMapping("/opop")
    public String index(){
        return "Hello SpringBoot";
    }
}
