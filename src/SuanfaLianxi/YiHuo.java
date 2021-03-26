package SuanfaLianxi;

import java.util.*;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/18 14:22
 */
public class YiHuo {
    public static void main(String[] args) {
        //System.out.println(findTheDifference("abcd", "abcde"));
        //System.out.println(reverse(1239));
        //System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
        //System.out.println(pivotIndex(new int[]{1, 7, 9, 6, 5, 6}));
        //System.out.println(isPalindrome(-121));
        //System.out.println(new YiHuo().removeDuplicates("abbaca"));
        test3();
    }

    public static char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int result=0;

        for(char ch:chars) result ^= ch;
        for(char ch:chart) result ^= ch;
        return (char)result;
    }

    public static int reverse(int x) {
        long res = 0;
        int n = x;
        while(x!=0) {
            res = res*10 +x%10;
            x = x/10;
        }
        return (int)res==res?(int)res:0;
    }

    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int index = stones.length - 1;
        while(index>=0) {
            if(stones[index] == stones[index-1]) {
                index = index-2;
            }
            else {

            }
        }
        return 5;
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0,j=1; j<s.length(); j++) {
            if(s.charAt(i)!=s.charAt(j)) {
                if(j-i<3) {
                    i=j;
                }
                else {
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(i);
                    l.add(j-1);
                    list.add(l);
                    i=j;
                }
            }
            else if(j==s.length()-1&&s.charAt(i)==s.charAt(j)&&j>i+1) {
                List<Integer> l = new ArrayList<Integer>();
                l.add(i);
                l.add(j);
                list.add(l);
            }
        }

        return list;
    }

    public int findCircleNum(int[][] M) {

        boolean[] visited = new boolean[M.length];
        int ret = 0;
        for(int i =0 ;i<M.length; i++) {
            for(int j=i+1; j<M.length; j++) {

            }
        }
        return ret;
    }

    public static int pivotIndex(int[] nums) {
        if(nums.length==0)
            return -1;
        int sums=0;
        for(int i=0; i<nums.length; i++)
            sums += nums[i];

        int sum1 = 0;
        int sum2 = sums-nums[0];
        if(sum2==0)
            return 0;
        for(int i=1; i<nums.length; i++) {
            sum1 += nums[i-1];
            sum2 -= nums[i];
            if(sum1==sum2)
                return i;
        }
        if(sums-nums[nums.length-1]==0)
            return nums.length-1;
        return -1;
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1=0,sum2=0;
        for(int i:A) {
            sum1+=i;
        }
        for(int i:B) {
            sum2+=i;
        }
        int diff = Math.abs(sum1-sum2);

        Set<Integer> set = new HashSet<>();
        for(int i:B)
            set.add(i);
        for(int i=0; i<A.length; i++) {
            if(set.contains(A[i]-diff/2)) {
                return new int[]{A[i],A[i]-diff/2};
            }
        }
        return null;
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c:chars)
            stack.push(c);
        for(char c:chars) {
            if(stack.pop()!=c)
                return false;
        }
        return true;
    }

    public String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        int i=0;
        for(int j=0;j<chars.length;j++) {
            if(i!=0 && chars[j]==chars[i-1]) i--;
            else chars[i++]=chars[j];
        }
        char[] result=Arrays.copyOf(chars, i);
        return new String(result);
    }

    public static void test1() {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arrs1 = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0; j<n; j++) {
                arrs1[i][j] = sc.nextInt();
            }
        }
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++) {
                System.out.print(arrs1[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void test2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double eps = 0.001;
        if(n>=0) {
            double x = n/2, y= n/x;
            while(x-y>eps || y-x>eps) {
                y=n/x;
                x=(x+y)/2;
            }
            System.out.printf("%.3f",x);
        }
    }

    public static void test3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n==1) {
            System.out.println(m);
            return;
        }
        int y = (m*2)/3;

        while(y>0) {
            int i=y;
            int sum = m-y;
            for(int j=1; j<n; j++) {
                sum -= sum/2;
                if(sum<=0 && j!= n-1)
                    continue;
            }
            if(sum>=1){
                System.out.println(y);
                return;
            }
            y--;
        }
    }
}




