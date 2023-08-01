package LoggerGroup.loggerapp;

/**
 * Hello world!
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.log4j.*;
//import org.apache.log4j.xml.DOMConfigurator;
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Logger logger=LoggerFactory.getLogger(App.class.getName());
    	//DOMConfigurator.configure("log4j.xml");
    	logger.info("info from slf4j");
    	logger.debug("debug");
    	logger.warn("displaying developer information");
    	

    	
    }
}
