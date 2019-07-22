package com.loveqrc.crud.component

import org.springframework.util.StringUtils
import org.springframework.web.servlet.LocaleResolver
import java.util.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class MyLocaleResolver : LocaleResolver {

    override fun resolveLocale(request: HttpServletRequest): Locale {
        val language = request.getParameter("l")
        var defaultLocale = Locale.getDefault()
        if (!StringUtils.isEmpty(language)) {
            val split = language.split("_")
            defaultLocale = Locale(split[0], split[1])
        }
        return defaultLocale
    }

    override fun setLocale(p0: HttpServletRequest?, p1: HttpServletResponse?, p2: Locale?) {

    }
}