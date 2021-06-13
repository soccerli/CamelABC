package com.soccerli.camelplain;

import com.soccerli.camelplain.RouteFileCopy;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import static java.lang.Thread.sleep;

public class MainApp {
    public static void main(String args[]){
        RouteFileCopy routeFileCopy=new RouteFileCopy();
        CamelContext ctx =new DefaultCamelContext();
        try{
            ctx.addRoutes(routeFileCopy);
            ctx.start();
            System.out.println("CamelAbc: Camel Plain:Route started, try it");
            sleep(1000*60*60);
            ctx.stop();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
