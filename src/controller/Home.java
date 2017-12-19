/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zyy43688
 * @version $Id: Home.java, v 0.1 2017年12月13日 下午1:45:12 zyy43688 Exp $
 */
@Controller
@RequestMapping("/home")
public class Home {
    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "This is a test!";
    }

    @RequestMapping("testJsp")
    public String testJsp() {
        return "test";
    }
}