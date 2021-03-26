package filetest;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/7 15:34
 */
public class Student {
    private String name;

    public int getId() {
        return id;
    }

    private int age;
    private int id;
    static int idCotent;

    public Student() {
        this.id = ++idCotent;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCotent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
