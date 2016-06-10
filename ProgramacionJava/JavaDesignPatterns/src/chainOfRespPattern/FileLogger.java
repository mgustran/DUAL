package chainOfRespPattern;

/**
 * Created by mgustran on 29/04/2016.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("File::Logger: " + message);
    }
}
