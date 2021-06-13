package com.soccerli.camelspringboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteFileCopy extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:/input")
                .to("file:C:/output");
    }
}
