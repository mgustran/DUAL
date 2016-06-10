package compositeEntityPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class CoarseGrainedObject {
    DependentO1 do1 = new DependentO1();
    DependentO2 do2 = new DependentO2();
    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }
    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
