package com.soccerli.camelspring;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan({"com.soccerli"})
public class CamelAppConfig extends CamelConfiguration{
    @Autowired
    RouteFileCopy routeFileCopy;

    public CamelAppConfig(RouteFileCopy routeFileCopy) {
        this.routeFileCopy = routeFileCopy;
    }

    @Override
    public List<RouteBuilder> routes(){
       List<RouteBuilder> routeBuilderList=new ArrayList<>();
       routeBuilderList.add(routeFileCopy);
       return routeBuilderList;
    }

}
