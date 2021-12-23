package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 

public class LogTest {
    
    private Logger logger = LogManager.getLogger(LogTest.class);
    
    public void printLog() {
        logger.debug("[debug] log!");
        logger.info("[info] log!");
        logger.warn("[warn] log!");
        logger.error("[error] log!");
    }
    
    public static void main(String[] args) {
		new LogTest().printLog();
	}
}
 
