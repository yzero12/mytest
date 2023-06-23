package com.yzero.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: LonginController
 * Package: com.yzero.java.controller
 * Description:
 *
 * @author zjzstart
 * @create 2023-06-09 12:40
 */
@RestController
public class LonginController {

    @GetMapping("/")
    public String t(){
        return "helloworld";
    }
}
