package org.example.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CamelProcessor implements Processor{
    private final Logger logger= LoggerFactory.getLogger(CamelProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        //using error for information purpose so no need to adjust log level in Fuse
       logger.error("in Camel Processor");
    }
}
