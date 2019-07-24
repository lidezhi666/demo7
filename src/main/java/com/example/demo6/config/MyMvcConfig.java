package com.example.demo6.config;

import com.example.demo6.component.LoginHandlerInterceptor;
import com.example.demo6.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {

        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/", "/user/login");
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                super.addViewControllers(registry);
            }

        };
        return adapter;
    }

    //@Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

}
