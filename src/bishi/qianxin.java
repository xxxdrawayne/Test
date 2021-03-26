package bishi;

import java.util.*;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/24 15:50
 */
public class qianxin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int m = sc.nextInt(); //物品种类
        double money=0;  //净利润
        int[] num = new int[m]; //限购数量
        int[] price1 = new int[m];
        int[] price2 = new int[m];
        double[] rate = new double[m]; //利率
        Boolean[] flag = new Boolean[m];
        for(int i=0; i<m; i++) {
            flag[i] = true;
        }
        for(int i=0; i<m; i++) {
            num[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++) {
            price1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++) {
            price2[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++) {
            rate[i] = (price2[i]-price1[i])/(double)price1[i];
        }

//        for(int i=0; i<m; i++) {
//            System.out.println(num[i]+" "+price1[i]+" "+ price2[i]+" "+rate[i]);
//        }

        HashMap<Double, Integer> map = new HashMap<>();
        for(int i=0; i<m; i++)
            map.put(rate[i],i);
        Arrays.sort(rate);

        int x2 = x;
        for(int i=m-1; i>=0; i--) {
            int n = map.get(rate[i]);
//            System.out.println(n+" "+rate[i]);
            if(x2/price1[n]>num[n]) {
                money += num[n]*price1[n]*rate[i];
//                System.out.println(money);
                x2 = x2 - num[n]*price1[n];
//                System.out.println(x2);
            }else if(x/price1[n]>0) {
                money += x2/price1[n]*price1[n]*rate[i];
//                System.out.println(money);
                x2 = x2 - x2/price1[n]*price1[n];
//                System.out.println(x2);
            }
        }
        System.out.println((int)(x+money));
    }
}
