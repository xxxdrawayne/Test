package test_1;

import java.util.Scanner;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/28 11:14
 */
public class twoFind {
    //int[][] arr = new int[3][3];
    static  int[][] arr = {{1,2,3,8},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

   //     System.out.println(Find(n,arr));

    }

    public static boolean Find(int target, int [][] array) {
//        if(array.length = 0)
//            throw java.lang.ArrayIndexOutOfBoundsException;

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if(array[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}
