package com.loveqrc.crud.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
class MyMvcConfig : WebMvcConfigurerAdapter() {

    override fun addViewControllers(registry: ViewControllerRegistry) {
        //设置视图映射规则
        //发送loveqrc请求到success页面
        registry.addViewController("/loveqrc").setViewName("success")
    }


}