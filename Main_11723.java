
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_11723 {
	static int N;
	static int masking;
	static StringBuilder sb = new StringBuilder();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		masking = 0;
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n;
			switch(st.nextToken()) {
			case "add":
				n = Integer.parseInt(st.nextToken());
				masking |= (1 << (n -1));
				break;
			case "remove":
				n = Integer.parseInt(st.nextToken());
				masking = masking & ~(1 << (n - 1));
				break;
			case "check":
				n = Integer.parseInt(st.nextToken());
				sb.append((masking & (1 << (n - 1))) != 0 ? "1\n" : "0\n");
				
				break;
			case "toggle":
				n = Integer.parseInt(st.nextToken());
				masking ^= (1 << (n - 1));
				break;
			case "all":
				masking |= (~0);
				break;
			case "empty":
				masking &= 0;
				break;
			}
			
			
			
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}
	
}
