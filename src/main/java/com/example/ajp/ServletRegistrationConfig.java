package com.example.ajp;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletRegistrationConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(@Value("${camel.rest.context-path}") String contextPath) {
        ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet(), contextPath + "/*");
        registration.setName("CamelServlet");
        return registration;
    }
}