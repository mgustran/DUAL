package businessDelegatePattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class EJBService implements BusinessService {
    @Override
    public  void  doProcessing(){
        System.out.println("Procesando tarea por invocacion del servicio EJB");
    }
}
