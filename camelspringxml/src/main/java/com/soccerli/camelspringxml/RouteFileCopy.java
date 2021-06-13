package com.soccerli.camelspringxml;

import org.apache.camel.builder.RouteBuilder;

public class RouteFileCopy extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:/input")
                .to("file:C:/output");

    }


}
