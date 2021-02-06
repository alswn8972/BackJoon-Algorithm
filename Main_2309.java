package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2309 {
	static int[] height;
	static int[] NanJang;
	static int N = 9;
	static int P = 7;
	static int total = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		height = new int[N];
		NanJang = new int[P];

		for(int i = 0; i < N; i++) {
			height[i] = sc.nextInt();
		}
		whoNan(0, 0);
		
		
	}
	static void whoNan(int cnt, int dep) {
		int totalH = 0;
		if(dep == P) {
			for(int i = 0; i < P; i++) {
				totalH += NanJang[i];
			}
			if(totalH == total) {
				Arrays.sort(NanJang);
				for(int i = 0; i < P; i++) {
					System.out.println(NanJang[i]);
				}
			}
			return;
		}
		
		for(int i = cnt; i < N; i++) {
			NanJang[dep] = height[i];
			whoNan(i+1, dep+1);
		}
	}
}
