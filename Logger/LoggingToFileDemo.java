import java.util.logging.*;
import java.io.*;

public class LoggingToFileDemo {
	private static final Logger LOGGER = Logger.getLogger(LoggingToFileDemo.class.getName());
	private static FileHandler fileHandler = null;
	
	private static void initLogger() throws Exception {
		fileHandler = new FileHandler("Debug.log", true);
		fileHandler.setFormatter(new SimpleFormatter());
		LOGGER.addHandler(fileHandler);
	}
	
	public static void main(String args[]) throws Exception {
		initLogger();
		LOGGER.log(Level.INFO, "This is line no. 1");
		LOGGER.log(Level.SEVERE, "Holyshit!!!! Help");
		LOGGER.log(Level.FINE, "Phew !!!");
	}
}
