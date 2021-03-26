package SuanfaLianxi;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/20 13:09
 */
public class addBinary {
    public static void main(String[] args) {
//        int i = 10;
//        System.out.println(Integer.toBinaryString(i));
 //       System.out.println(addBinary("100","1111"));
        System.out.println(hammingWeight(11));
    }

    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(i>=0 &&  j>=0) {
            int sum = carry;
            sum += a.charAt(i--)-'0';
            sum += b.charAt(j--)-'0';
            carry = sum/2;
            sb.append(sum%2);
        }
        while(i>=0) {
            int sum = carry + (a.charAt(i--)-'0');
            carry = sum/2;
            sb.append(sum%2);
        }
        while(j>=0) {
            int sum = carry + (b.charAt(j--)-'0');
            carry = sum/2;
            sb.append(sum%2);
        }
        if(carry == 1)
            sb.append(1);
        return sb.reverse().toString();
    }

    public static int hammingWeight(int n) {
        int res=0;
        while(n!=0) {
//            n&=n-1;
//            res++;
            if( (n&1) == 1)
                res++;
            n = n>>1;
        }
        return res;
    }
}
