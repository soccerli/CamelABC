package org.example.camel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleBeanClass {
    private final Logger logger= LoggerFactory.getLogger(ExampleBeanClass.class);

    //using error for information purpose so no need to adjust log level in Fuse
    public void exampleMethod(){
        logger.error("now in exampleMethod");
    }
}
