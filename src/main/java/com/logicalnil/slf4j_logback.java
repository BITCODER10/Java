package com.logicalnil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4j_logback {
    public static final Logger logger = LoggerFactory.getLogger(slf4j_logback.class);
    private final String name = "swapnil";
    private final String email = "somethisng@nothing.com";
    void printLoggers(){
        logger.info("Starting the Application");
        logger.debug("debug message");
        logger.info("information message ");
        logger.warn("warning......");
        logger.error("error.....");
    }

    void actualLogging(){
        try{
            int result = 10/0;
        }catch (Exception e){
            logger.error("calculation error");
        }
    }
}
