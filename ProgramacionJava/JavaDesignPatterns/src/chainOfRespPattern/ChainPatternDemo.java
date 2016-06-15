package chainOfRespPattern;

/**
 * Created by mgustran on 29/04/2016.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is information man!");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information man!");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information man!");
    }
}
