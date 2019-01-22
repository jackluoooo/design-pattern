package factory.simplefactory;

/**
 * @author：罗金星 date 2019/1/10 14:45
 * 简单Factory
 **/
public class CarFactory {
    public  static Car creatCar(String type){
        if(type.equals("audi")){
            return  new Audi();
        }else if(type.equals("byd")){
            return  new Byd();
        }else {
            return null;
        }
    }
}
