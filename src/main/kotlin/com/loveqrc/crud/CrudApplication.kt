package com.loveqrc.crud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.View
import org.springframework.web.servlet.ViewResolver
import java.util.*

@SpringBootApplication
class CrudApplication

fun main(args: Array<String>) {
    SpringApplication.run(CrudApplication::class.java, *args)


    @Bean
    fun myViewReolver(): ViewResolver? {
        return MyViewResolver()
    }


}

class MyViewResolver : ViewResolver {

    override fun resolveViewName(viewName: String, locale: Locale): View? {
        return null
    }

}

