package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Main_15649 {
	private static int N;
	private static int M;
	private static int[] arr;
	private static boolean[] isCheck;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		isCheck = new boolean[N];
		
		Combi(0, 0);
		
	}
	
	private static void Combi(int n, int m) {
		//종료
		if(m == M) {
			for(int i = 0 ; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		//실행
		for(int i = 0 ; i < N; i++) {
		
			if(isCheck[i] == true)	continue;
			
			arr[m] = i+1;
			isCheck[i] = true; 
			Combi(n + 1, m+1);
			isCheck[i] = false;
		}
	}
}

	