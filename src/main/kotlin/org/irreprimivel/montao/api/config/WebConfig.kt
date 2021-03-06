package org.irreprimivel.montao.api.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
@EnableWebMvc
@ComponentScan(
        basePackages = arrayOf("org.irreprimivel.montao.api"),
        includeFilters = arrayOf(ComponentScan.Filter(RestController::class)))
class WebConfig : WebMvcConfigurerAdapter()