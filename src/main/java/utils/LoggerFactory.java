package utils;
/**
 * These imports bring in classes from the Log4j library.
 * Logger is the class used for logging, and PropertyConfigurator is used to configure Log4j based on a properties file.
 */

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/**
 * Utility class for configuring and retrieving loggers using Log4j.
 * This class is named LoggerFactory, indicating its purpose of creating and managing logger instances.
 */
public class LoggerFactory {

    //The root variable is used to keep track of whether Log4j has been configured. It is initially set to false.
    private static boolean root=false;

    /**
     * This method retrieves a logger instance for a specified class.
     * It takes a Class object as a parameter, representing the class for which the logger is requested.
     *
     * @param cls the class for which to retrieve the logger
     * @return the logger instance
     */
    public static Logger getLogger(Class cls){
        //If Log4j has already been configured (root is true),
        // it simply returns the logger for the specified class using Logger.getLogger(cls).
        if(root){
            return Logger.getLogger(cls);
        }
        //initialize the Log4j configuration
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        //If Log4j has not been configured yet (root is false),
        // it configures Log4j using the properties file "log4j.properties" and
        // sets root to true to avoid repeated configuration.
        root = true;
        return Logger.getLogger(cls);
    }
}