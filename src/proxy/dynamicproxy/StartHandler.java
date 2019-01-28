package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author：罗金星 date 2019/1/24 17:42
 **/
public class StartHandler implements InvocationHandler {
    Star realStar;

    public StartHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

       Object object=null;
       if(method.getName().equals("sing")){
           object=method.invoke(realStar,args);
       }
        return object;
    }
}
