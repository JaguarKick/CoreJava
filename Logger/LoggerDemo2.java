import java.io.*;
import java.util.logging.*;

public class LoggerDemo2 {
	public static final Logger LOGGER = Logger.getLogger(LoggerDemo2.class.getName());
	
	public static void main(String args[]) throws Exception {
		LOGGER.log(Level.SEVERE,"This is a severe message.");
		LOGGER.log(Level.WARNING, "This is a warning message.");
		LOGGER.log(Level.INFO, "This is an informational message.");
		LOGGER.log(Level.FINE, "A fine message.");
	}
}
