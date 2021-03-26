package Reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/24 19:00
 */
public class DemoDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("Test2223\\Reflect\\DemoDemo.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class<?> a = Class.forName(className);
        Object obj = a.getConstructor().newInstance();

        Method method = a.getMethod(methodName);
        method.invoke(obj);
    }
}
