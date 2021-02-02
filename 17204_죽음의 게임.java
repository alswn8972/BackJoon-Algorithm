package AddAlgo;

import java.util.Scanner;

public class Main_17204 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int person = s.nextInt();
		int bosung = s.nextInt();
		
		int[] point = new int[person];
		boolean[] ischeck = new boolean[person];
		for(int i = 0; i < person; i++) {
			point[i] = s.nextInt();
		}
		
		int nextPerson = point[0];
		int check = 1;
		
		while(nextPerson != bosung) {
			check++;
			nextPerson = point[nextPerson];
			if(ischeck[nextPerson] == false) ischeck[nextPerson] = true;	
			else {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(check);
	}
}
