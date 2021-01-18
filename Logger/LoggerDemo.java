import java.util.logging.*;
import java.io.*;

public class LoggerDemo {
	private static final Logger LOGGER = Logger.getLogger(LoggerDemo.class.getName());
	
	public static void main(String args[]) throws Exception {
		LOGGER.info("This is a simple text.");
	}
}
