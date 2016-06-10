package businessDelegatePattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }
    public void doTask(){
        businessService.doTask();
    }
}
