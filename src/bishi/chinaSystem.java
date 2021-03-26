package bishi;

import java.util.Scanner;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/20 14:56
 */
public class chinaSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i=0;
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n==0)
                break;
            arr[i] = n;
            i++;
        }
        int j=0;
        while(arr[j]!=0) {
            method(arr[j]);
            j++;
        }
        System.out.print(0);
    }

    public static void method(int n) {
        int res = 0;
        if(n<2)
            res = 0;
        while(n>2) {
            int x = n/3;
            n = n%3 + x;
            res = res + x;
        }
        if(n==2)
            res++;
        System.out.println(res);
    }
}
