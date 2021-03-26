package SuanfaLianxi;

import java.util.*;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/2 14:27
 */
public class JiaoJi {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};
        //System.out.println(Arrays.toString(intersection(num1, num2)));
        System.out.println(majorityElement(new int[]{3, 2, 3}));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int Min;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums1.length >= nums2.length) {
            Min = 2;
            for (int i = 0; i < nums1.length; i++)
                map.put(nums1[i], 1);
        } else {
            Min = 1;
            for (int i = 0; i < nums2.length; i++)
                map.put(nums1[2], 1);
        }

        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator1 = integers.iterator();
        while(iterator1.hasNext()) {
            System.out.print(iterator1.next()+"  ");
        }


        HashSet<Integer> set = new HashSet<>();
        if (Min == 1) {
            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i]))
                    set.add(nums1[i]);
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i]))
                    set.add(nums2[i]);
            }
        }
        int i = 0;
        int arr[] = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            arr[i] = iterator.next();
            i++;
        }
        return arr;
    }

    public static int majorityElement(int[] nums) {
        //ArrayList<Integer> list = new ArrayList<>();
        int count = 0; int key=0;
        for(int i=0,l=nums.length; i<l;i++) {
            if(count == 0) {
                key = nums[i];
                count ++;
            }
            else if(key == nums[i])
                count++;
            else count--;
        }
        count = 0;
        for(int i=0, l=nums.length; i<l; i++) {
            if(key == nums[i])
                count++;
        }

        if(count >= nums.length/2 +1)
            return key;
        return -1;
    }
}
