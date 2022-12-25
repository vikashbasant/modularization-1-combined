package in.co.decimal.loggers.testing;
import java.util.List;
import java.util.logging.Logger;

public class LoggerUsingToPrint {

	private static Logger logger = Logger.getLogger(LoggerUsingToPrint.class.getName());

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

		logger.info(list.toString());
	}

}
