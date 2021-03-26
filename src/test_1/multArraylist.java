package test_1;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/7 11:49
 */
public class multArraylist {
    public static void main(String[] args) {

    }

    public int[] multiply(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        B[0] = 1;
        if(n>1) {
            for (int i=0; i<n-1; i++) {
                B[i+1] = B[i]*A[i];
            }
            int temp = 1;
            for(int i=n-2; i>=0; i--) {
                temp *= A[i+1];
                B[i] *= temp;
            }

        }
        return B;
    }
}
