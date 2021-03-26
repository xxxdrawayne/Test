package SuanfaLianxi;

import java.util.Arrays;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/19 17:59
 */
public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
//        int length = nums.length;
//        for(int i=1; i<length; ) {
//            if(nums[i]!=nums[i-1]) {
//                System.out.println(i+" "+nums[i]);
//                i++;
//            }
//
//            else {
//                int j=i; int l=length;
//                while(j!=length) {
//                    nums[j-1] = nums[j];
//                    j++;
//                }
//                length--;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        return length;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != nums[count]) {
                nums[++count] = nums[i];
            }
        }
        return count+1;
    }
}

