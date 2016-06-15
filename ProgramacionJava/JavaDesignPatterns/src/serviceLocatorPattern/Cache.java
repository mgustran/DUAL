package serviceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgustran on 11/05/2016.
 */
public class Cache {
    private List<Service> services;

    public Cache(){
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : services){
            if (service.getName().equalsIgnoreCase(String.valueOf(serviceName))){
                System.out.println("Returning cached " + serviceName + "object");
                return service;
            }
        }
        return null;
    }

    public  void  addService(Service newService){
        boolean exists = false;
        for (Service service : services){
            if (service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if (!exists){
            services.add(newService);
        }
    }
}
