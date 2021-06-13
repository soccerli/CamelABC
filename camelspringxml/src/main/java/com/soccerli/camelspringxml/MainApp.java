package com.soccerli.camelspringxml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.Thread.sleep;

public class MainApp {

    public static void main(String args[]) throws InterruptedException {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-withCamel.xml");
        ctx.start();
        System.out.println("CamelAbc: Camel SpringXml:Route started, try it");
        sleep(1000*60*60);
        System.out.println("at the end");
    }
}
