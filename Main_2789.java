package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2789 {
	static int N;
	static int Total;
	static int M = 3;
	static int[] arr;
	static int[] res;
	static int max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		Total = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		res = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		BlackJack(0, 0);
		bw.write(max + " ");
		bw.flush();
		bw.close();
		br.close();
		
	}
	static void BlackJack(int cnt, int dep) {
		int total = 0;
		if(dep == M) {
			for(int i = 0; i < M; i++) {
				total += res[i];
			}
			if(Total >= total) {
				max = Math.max(max, total);
			}
			return;
		}
		
		for(int i = cnt; i < N; i++) {
			res[dep] = arr[i];
			BlackJack(i+1,dep+1);
		}
	}
}
