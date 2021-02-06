package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_15652 {
	static int N;
	static int M;
	static int[] arr;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		dfs(0, 0);
		bw.flush();
		bw.close();
		
	}
	static void dfs(int cnt, int dep) throws IOException {
		if(dep == M) {
			for(int i = 0; i < M; i++) {
				bw.write(arr[i] + " ");
			}
			bw.newLine();
			return;
		}
		
		for(int i = cnt; i < N; i++) {
			arr[dep] = i+1;
			dfs(i, dep + 1);
		}
	}
}
