package SuanfaLianxi;

import java.util.Arrays;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/19 19:07
 */
public class AddOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        //System.out.println(Arrays.toString(plusOne(arr)));
        System.out.println(validMountainArray(new int[]{14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3}));
    }

    public static int[] plusOne(int[] digits) {
//        int length = digits.length;
//        int l;
//        int[] arr = new int[digits.length+1];
//        if(digits[length-1]!=9) {
//            digits[length-1]++;
//            return digits;
//        }
//        else {
//            for(l=length-1; l>=0; l--) {
//                if(digits[l]!=9) {
//                    digits[l]++;
//                    for(int i=l+1; i<digits.length; i++)
//                        digits[i] = 0;
//                    return digits;
//                }
//                else if(l==0){
//                    arr[0] = 1;
////                    for(int i=1; i<arr.length; i++)
////                        arr[i] = 0;
//                }
//            }
//        }
//        return arr;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    public static boolean validMountainArray(int[] A) {
        int i;

        if(A.length<=2)
            return false;

        if(A[1]<=A[0])
            return false;

        for(i=1; i<A.length-1; i++) {
            if(A[i+1]<A[i])
                break;
        }

        if(i>= A.length-1)
            return false;

        System.out.println(i);

        for(int j=i; j<A.length-1; j++) {
            if(A[j+1]>=A[j])
                return false;
        }
        return true;
    }
}
