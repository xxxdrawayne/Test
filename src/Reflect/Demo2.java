package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/24 18:42
 */
public class Demo2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);

        Class<?> c = al.getClass();

        Method add = c.getMethod("add", Object.class);

        add.invoke(al,"hello");
        add.invoke(al,10);
        add.invoke(al,"唐才平");

        System.out.println(al);
    }
}
