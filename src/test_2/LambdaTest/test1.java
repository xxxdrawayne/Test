package test_2.LambdaTest;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/23 16:09
 */
interface cat {
     public abstract void eat(int n);
}

//class catimpl implements cat{
//    public void eat(int n){
//        System.out.println("嘻嘻");
//    }
//}

public class test1 {
    public static void main(String[] args) {
//        new catimpl().eat(5);
//        useEat(new catimpl());
        useEat((int n)->
            System.out.println("3嘻嘻"));
        cat cc = n -> System.out.println("zjh666");
        cc.eat(5);
    }

    public static void useEat(cat a) {
        a.eat(3);
    }
}
