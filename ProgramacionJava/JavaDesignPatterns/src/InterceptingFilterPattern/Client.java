package InterceptingFilterPattern;

/**
 * Created by mgustran on 10/05/2016.
 */
public class Client {
    public FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
