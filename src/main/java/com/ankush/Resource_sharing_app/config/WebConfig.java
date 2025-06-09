package com.ankush.Resource_sharing_app.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

//This file is for enabling frontend can communicate with my backend without cors errors.
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    //Enable CORS globally:
//    @Override
//    public void addCorsMappings(CorsRegistry registry){
//        registry.addMapping("/**")  //Allow all endpoints
//                .allowedOrigins("*")    //Adjust this in productions(e.g., "http://lcoalhost:3000")
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
//                .allowedHeaders("*");
//    }
//
//    //Customize Jackson's ObjectMapper
//    @Bean
//    public ObjectMapper objectMapper(){
//        return Jackson2ObjectMapperBuilder.json().modules(new JavaTimeModule())     //support for java 8+ time types.
//                .build();
//    }
//}


@Configuration
public class WebConfig {
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration configuration=new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.setAllowedOriginPatterns(Arrays.asList("*"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PATCH", "DELETE", "PUT"));

        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return new CorsFilter(source);
    }

    //Customize Object mapper:
    @Bean
    public ObjectMapper objectMapper(){
        return Jackson2ObjectMapperBuilder.json().modules(new JavaTimeModule()).build();
    }
}