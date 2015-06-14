import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * LoggerTestExample.java
 *
 * Date Jun 14, 2015 12:12:01 PM
 * 
 * @author Md Ayub Ali Sarker, ayub.ali.sarker@gmail.com
 * 
 **/

public class LoggerTestExample {
	static Logger log = Logger.getLogger(LoggerTestExample.class);

	public static void main(String[] args) {

		PropertyConfigurator
				.configureAndWatch("config/log4j.properties", 2000L);

		log.debug("This is a debug message");
		myMethod();
		log.info("This is an info message");
	}

	private static void myMethod() {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			log.error("This is an exception", e);
		}
	}

}
