package InterceptingFilterPattern;

/**
 * Created by mgustran on 10/05/2016.
 */
public class FilterManager {
    public FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
