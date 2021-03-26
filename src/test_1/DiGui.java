package test_1;

import java.util.Scanner;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/12 11:29
 */
public class DiGui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(method(n));


    }
    public static  int method(int target) {
//        if(n == 1) {
//            return 1;
//        }
//        else {
//            return (n-1)+ method(n-1);
//        }
        if(target <= 4) {
            return target;
        }

        int reg = 0;
        for(int i=1; i<target; i++) {reg = Math.max(reg, i*method(target-1));
        }
        return reg;
    }
}
