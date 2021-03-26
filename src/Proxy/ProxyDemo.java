package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/1 14:15
 */
public class ProxyDemo {

}

interface Speak {
    public void speak();
}

class LawyerProxy implements InvocationHandler {
    Object obj;

    public LawyerProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if(method.getName().equals("speak")) {
            System.out.println("引用法律条文！");
            method.invoke(obj,objects); //反射
        }
        return null;
    }
}



class Zhangsan implements Speak{

    @Override
    public void speak() {
        System.out.println("我被人揍了");
    }
}

class Demo {
    public static void main(String[] args) {
        //静态代理
        Speak speak = new Zhangsan();
        speak.speak();
        //JDK动态代理:本体必须实现接口
        LawyerProxy lawyerProxy = new LawyerProxy(new Zhangsan());
        Speak speak1 = (Speak) Proxy.newProxyInstance(Demo.class.getClassLoader(),new Class[]{Speak.class},lawyerProxy);
        speak1.speak();
        //CGlib动态代理:是JDK代理的补充，不要求本体实现接口

    }
}