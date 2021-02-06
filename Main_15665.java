package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15665 {
	static int N;
	static int M;
	static int[] arr;
	static int[] result;
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		result = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		dfs(0);
		bw.flush();
		bw.close();
		br.close();
	}
	static void dfs(int dep) throws IOException {
		if(dep == M) {
			for(int i = 0; i < M; i++) {
				bw.write(result[i] + " ");
			}
			bw.newLine();
			return;
		}
		
		int preNum = 0;
		for(int i = 0; i < N; i++) {
			if(preNum == arr[i]) continue;
			preNum = arr[i];
			result[dep] = arr[i];
			dfs(dep+1);
		}
		
	}
}
