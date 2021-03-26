package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/24 18:07
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取class对象
        Class<?> c = Class.forName("Reflect.Student");

        Field[] fields1 = c.getFields();
        Field[] fields2 = c.getDeclaredFields();

        for(Field f:fields1)
            System.out.println(f);
        for(Field f:fields2)
            System.out.println(f);
        System.out.println("---------------");
        Field field = c.getField("adress");

        Constructor<?> constructor = c.getConstructor();
        Object o = constructor.newInstance();

        field.set(o,"商洛");

        System.out.println(o);

        fields2[0].setAccessible(true);
        fields2[1].setAccessible(true);
        fields2[0].set(o,"朱家豪");
        fields2[1].set(o,20);
        fields2[2].set(o,"临潼");
        System.out.println(o);

    }
}
