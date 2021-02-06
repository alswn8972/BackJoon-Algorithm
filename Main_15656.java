package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15656 {
	static int N;
	static int M;
	static int[] arr;
	static int[] result;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		result = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		dfs(0);
		bw.flush();
		bw.close();
	}
	static void dfs(int dep) throws IOException {
		if(dep == M) {
			for(int i = 0; i < M; i++) {
				bw.write(result[i]+" ");
			}
			bw.newLine();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			result[dep] = arr[i];
			dfs(dep+1);
		}
	}
}
