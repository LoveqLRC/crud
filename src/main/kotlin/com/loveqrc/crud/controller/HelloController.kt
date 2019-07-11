package com.loveqrc.crud.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @ResponseBody
    @RequestMapping("/kotlinHello")
    fun sayHello(): String {
        return "kotlin aaa Hello world"
    }

    @RequestMapping("/success")
    fun success(map: MutableMap<String, Any>): String {
        map["hello"] = "<h1>你好</h1>"
        return "success"

    }
}