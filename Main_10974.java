package day6;

import java.util.Scanner;

public class Main_10974 {
	static int N;
	static int[] arr;
	static int[] res;
	static boolean[] isCheck;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		arr = new int[N];
		res = new int[N];
		isCheck = new boolean[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		Per(0);
	}
	static void Per(int dep) {
		if(dep == N) {
			for(int i = 0; i < N; i++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i = 0; i < N; i++) {
			if(isCheck[i] == true) continue;
			isCheck[i] = true;
			res[dep] = arr[i];
			Per(dep+1);
			isCheck[i] = false;
		}
	}
}
