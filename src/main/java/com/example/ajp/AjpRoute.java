package com.example.ajp;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AjpRoute extends EndpointRouteBuilder {

    @Override
    public void configure() throws Exception {
        from("rest:get:test")
        .setBody().constant("Hello")
        .log("Hello");
    }
}
