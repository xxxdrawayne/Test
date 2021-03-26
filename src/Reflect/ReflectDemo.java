package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/24 14:16
 */
/*
        三种方式获取Class对象；
        Class<Student> studentClass = Student.class;
        Class<? extends Student> aClass = new Student().getClass();
        Class<?> aClass1 = Class.forName("Reflect.Student");
*/

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<Student> studentClass = Student.class;
//
//        Class<? extends Student> aClass = new Student().getClass();

        Class<?> c = Class.forName("Reflect.Student");
//        System.out.println(c);
        //返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共构造器
        Constructor<?>[] constructors = c.getConstructors();
        //返回一个 Constructor对象，该对象反映 Constructor对象表示的类的所有构造器
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor con : declaredConstructors)
            System.out.println(con);

        System.out.println("-----------------");

        Constructor<?> dc = c.getDeclaredConstructor(String.class, int.class, String.class);
        //dc.setAccessible(true); //暴力反射
        System.out.println(dc.newInstance("tcp", 22, "shangluo"));

        Constructor<?> constructor = c.getConstructor();

        Object obj = constructor.newInstance();
        System.out.println(obj);

        Method function = c.getDeclaredMethod("method2", String.class);
        function.setAccessible(true);
        function.invoke(obj,"tangcaiping");
    }
}
