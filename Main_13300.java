import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int students = Integer.parseInt(st.nextToken());
		int roomsize = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[7][2];
		
		for(int i = 0; i < students; i++) {
			st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			arr[grade][sex]++;
		}
		int cnt = 0;
		for(int i = 1; i < 7; i++) {
			for(int j = 0; j < 2; j++) {
				cnt += arr[i][j]/roomsize;
				if(arr[i][j] % roomsize !=0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
