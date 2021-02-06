package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1759 {
	static char[] moum = {'a', 'e', 'i', 'o', 'u'};
	static char[] code;
	static char[] pass;
	static boolean[] isCheck;
	static int L;
	static int C;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		C = sc.nextInt();
		
		code = new char[C];
		pass = new char[L];
		isCheck = new boolean[C];
			
		for(int i = 0; i < C; i++) {
			code[i] = sc.next().charAt(0);
		}
		Arrays.sort(code);
		Password(0, 0);	
	}
	static void Password(int cnt, int dep) {
		int mo = 0;
		int ja = 0;
		if(dep == L) {
			for(int i = 0; i < L; i++) {
					if(pass[i] == 'a' || pass[i] ==  'e' || pass[i] ==  'i' || pass[i] == 'o' || pass[i] == 'u') {
						mo++;
					}
					else {
						ja++;
					} 
				}
			if(mo >= 1 && ja >= 2) {
				for(int i = 0; i < L; i++) {
					System.out.print(pass[i]);
				}
				System.out.println();
			}
			return;
		}
		for(int i = cnt; i < C; i++) {
			pass[dep] = code[i];
			Password(i+1, dep+1);
		}
		
	}
}
