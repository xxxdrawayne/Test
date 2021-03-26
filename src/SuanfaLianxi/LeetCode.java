package SuanfaLianxi;

import java.util.Stack;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/15 22:09
 */
public class LeetCode {
    public static void main(String[] args) {
        //simplifyPath("/a/./b/../../c/");
        //System.out.println(generateMatrix(4));
        //generateMatrix(3);
        printRes(generateMatrix(4));


        //System.out.println(fl);
    }

    public static String simplifyPath(String path) {
        String[] chars = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(int i=0; i<chars.length; i++) {
            if(chars[i].length()!=0&&!chars[i].equals(".")&&!chars[i].equals("..")) {
                stack.push(chars[i]);
            }
            if(chars[i].equals("..")&&!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty())
            return "/";
        for(String s:stack) {
            sb.append('/');
            sb.append(s);
        }
        System.out.println(sb);
        return sb.toString();
    }
    public static int[][] generateMatrix(int n) {
        if(n==0)
            return new int[0][0];
        if(n==1)
            return new int[][]{{1}};
        int[][] res = new int[n][n];

        int num = 1;
        int row=0,cow=0;
        while(num<=n*n) {
            while(cow<n && res[row][cow]==0) {
                res[row][cow] = num++;
                if(cow<n-1&&res[row][cow+1]==0)
                    cow++;
            }
            row++;
            while(row<n && res[row][cow]==0) {
                res[row][cow] = num++;
                if(row<n-1&&res[row+1][cow]==0)
                    row++;
            }
            cow--;
            while(cow>=0 && res[row][cow]==0) {
                res[row][cow] = num++;
                if(cow>0&&res[row][cow-1]==0)
                    cow--;
            }
            row--;
            while(row>=0 && res[row][cow]==0) {
                res[row][cow] = num++;
                 if(row>0&&res[row-1][cow]==0)
                    row--;
            }
           cow++;
        }

        return res;

    }
    public  static void printRes(int[][] res) {
        System.out.println(res[0][1]);
        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res.length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
