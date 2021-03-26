package Reflect;

import org.w3c.dom.ls.LSOutput;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/24 14:18
 */
public class Student {
    private String name;
    int age;
    public String adress;

    public Student(){
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    private void function() {
        System.out.println("function");
    }

    public static void method1() {
        System.out.println("method1");
    }

    public void method2(String s) {
        System.out.println("method2"+s);
    }

    public void method3(String s,int i){
        System.out.println(s+" "+i);
    }

    @Override
    public String toString() {
        return "Student {"+"name = "+name+",age = "+age+",adress = "+adress+"}";
    }
}
