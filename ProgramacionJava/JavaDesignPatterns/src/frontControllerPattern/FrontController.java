package frontControllerPattern;

/**
 * Created by mgustran on 10/05/2016.
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticades successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " + request) ;
    }

    public void dispatchRequest(String request){
        trackRequest(request);
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }

}


