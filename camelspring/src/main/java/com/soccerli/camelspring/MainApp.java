package com.soccerli.camelspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import static java.lang.Thread.sleep;

public class MainApp {

    public static void main(String args[]) throws InterruptedException {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(CamelAppConfig.class);
        ctx.start();
        System.out.println("CamelAbc: Camel Spring:Route started, try it");
        sleep(1000*60*60);
        System.out.println("at the end");

    }
}
