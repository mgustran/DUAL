package chainOfRespPattern;

/**
 * Created by mgustran on 29/04/2016.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Error Console::Logger: " + message);
    }
}