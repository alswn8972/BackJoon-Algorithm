package day6;

import java.util.Scanner;

public class Main_15650 {
	private static int N;
	private static int M;
	private static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[M];
		dfs(0, 0);
	}
	private static void dfs(int cnt, int dep) {

		if(dep == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");	
			}
			System.out.println();
			return;
		}
		
		for(int i = cnt; i < N; i++) {
			arr[dep] = i+1;
			dfs(i + 1, dep + 1);
		}
	}

}
