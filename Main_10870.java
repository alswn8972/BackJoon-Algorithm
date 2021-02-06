package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int result = Fibo(N);
		bw.write(result + " ");
		bw.flush();
		bw.close();
		br.close();
	}
	static int Fibo(int cnt) {
		if(cnt == 0) {
			return 0;
		}
		if(cnt == 1) {
			return 1;
		}
		return Fibo(cnt-1) + Fibo(cnt -2);
	}
}
