package test_1;

import java.util.Scanner;
public class yanghui {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 10;
		int arr2[][] = new int[n][];
		System.out.println("------------------------- ");
		for(int i=0; i<n; i++){
			arr2[i] = new int[i+1];
		}
		for(int i=0; i<n;i++){
			arr2[i][0] = 1;
			arr2[i][i] = 1;
		}
		for(int i=2; i<n; i++){
			for(int j=1; j<i; j++){
				arr2[i][j] = arr2[i-1][j-1] + arr2[i-1][j];
			}
		} 
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				System.out.print(arr2[i][j]+" ");
			}
			if(i<n-1)
				System.out.println();
		}
	}
}