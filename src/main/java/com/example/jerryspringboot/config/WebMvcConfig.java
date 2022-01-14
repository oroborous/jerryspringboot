package com.example.jerryspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.webflow.view.AjaxThymeleafViewResolver;
import org.thymeleaf.spring5.webflow.view.FlowAjaxThymeleafView;

@EnableWebMvc
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/login");
//        registry.addViewController("/logoutSuccess");
    }

    @Bean
    public AjaxThymeleafViewResolver viewResolver() {
        AjaxThymeleafViewResolver resolver = new AjaxThymeleafViewResolver();
        resolver.setViewClass(FlowAjaxThymeleafView.class);
        return resolver;
    }
}
