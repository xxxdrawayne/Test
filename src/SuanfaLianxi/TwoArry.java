package SuanfaLianxi;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/14 12:07
 */
public class TwoArry {
    public static void main(String[] args) {
        System.out.println(findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
        System.out.println(findMinArrowShots(new int[][]{}));
    }

    public  static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[10000];
        int[] res = new int[arr1.length];
        int index=0;

        for(int i:arr1) {
            arr[i]++;
        }

        for(int i:arr2) {
            while(arr[i]>0) {
                res[index++] = i;
                arr[i]--;
            }
        }

        for(int i:arr) {
            while(arr[i]>0) {
                res[index++] = i;
                arr[i]--;
            }
        }

        return res;
    }

    public static int findMinArrowShots(int[][] points) {
        if(points.length == 0)
            return 0;
        Arrays.sort(points,(a,b)->(a[1]-b[1]));
//        Arrays.sort(points,new Comparator<int[]>(){
//            public int compare(int[] a,int[] b) {
//                return a[1]-b[1];
//            }
//        });

        /*
        * for(int i=0; i<points.length; i++) {
        *   System.out.println(points[i][0]+" "+points[i][1]);
        *}
        */

        int count = 1;
        int p = points[0][1];
        for(int i=0; i<points.length; i++){
            if(points[i][0]>p || points[i][1]<p) {
                p = points[i][1];
                count ++;
            }
        }

        return count;
    }
}
