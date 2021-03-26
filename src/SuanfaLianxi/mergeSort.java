package SuanfaLianxi;

import java.util.HashMap;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/19 22:39
 */
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,5,2,7,12,4,3,1,11};
        printArr(arr);
        mergeSort(arr);
        printArr(arr);
    }
//归并排序入口
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        msort(arr,temp,0,arr.length-1);
    }
//归并排序
    public static void msort(int[] arr,int[] temp,int left,int right) {
        //如果只有一个元素，就不需要划分，其本来就是有序的
        if(left<right) {
            //找中间点
            int mid = (left+right)/2;
            //递归划分左半区
            msort(arr,temp,left,mid);
            //递归划分右半区
            msort(arr,temp,mid+1,right);
            //合并已经排序的部分
            merge(arr,temp,left,mid,right);
        }
    }
//合并
    public static void merge(int[] arr,int[] temp,int left,int mid,int right){
        //标记左半区第一个未排序的元素
        int l_pos = left;
        //标记右半区第一个未排序的元素
        int r_pos = mid+1;
        //临时数组元素的下标
        int pos = left;
        //合并
        while(l_pos<=mid && r_pos<=right) {
            if (arr[l_pos] < arr[r_pos]) {  //左半区第一个剩余元素更小
                temp[pos++] = arr[l_pos++];
            }
            else {  //右半区第一个剩余元素更小
                temp[pos++] = arr[r_pos++];
            }
        }
        //合并左半区剩余的元素
        while(l_pos<=mid)
            temp[pos++] = arr[l_pos++];
        //合并右半区剩余的元素
        while(r_pos<=right)
            temp[pos++] = arr[r_pos++];
        //把临时数组中合并后的元素复制回原来的数组
        while(left<=right) {
            arr[left] = temp[left];
            left++;
        }
    }

    public static void printArr(int[] arr) {
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
