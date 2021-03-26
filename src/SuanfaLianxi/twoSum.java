package SuanfaLianxi;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/19 10:56
 */
public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(twoSum(arr,9)[0]+"  "+twoSum(arr,9)[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
 //       int[] arr = new int[2];
        //------------------两层循环
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    arr[0] = i;
//                    arr[1] = j;
//                    return arr;
//                }
//            }
//        }
//        return null;
        //-------------------------利用hashmap
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.clone();
//        for(int i=0; i<nums.length; i++)
//            map.put(nums[i],i);
//        for(int i=0; i<nums.length; i++) {
//            if (map.get(target - nums[i]) != null && map.get(target - nums[i]) != i)
//                return new int[]{i, map.get(target - nums[i])};
//        }
//        return null;
        int[] arr = nums.clone();
        int start=0; int end = nums.length-1;
        Arrays.sort(arr);
        while(start<end) {
            if(arr[start]+arr[end] < target)
                start++;
            else if(arr[start]+arr[end] > target)
                end--;
            else
                break;
        }
        if(start<end) {
            int[] result = new int[2];
            int count=0;
            for(int i=0; i<nums.length; i++) {
                if(nums[i]==arr[start] || nums[i]==arr[end]) {
                    result[count++] = i;
                    if(count == 2)
                        return result;
                }
            }
        }
        return null;
    }
}
