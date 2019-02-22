package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author：罗金星 date 2019/1/24 17:42
 * InvocationHandler invoke,
 * Proxy Jdk动态代理方式
 **/
public class StartHandler implements InvocationHandler {
    Star realStar;

    public StartHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       //在此方法中做代理的流程控制
       Object object=null;
       if(method.getName().equals("sing")){
           object=method.invoke(realStar,args);
       }
        return object;
    }
}
