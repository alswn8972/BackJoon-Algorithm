package day6;




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main_1302 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> sells = new HashMap<String, Integer>();
		
		int max = 0;
		String book = "";
		int N = sc.nextInt();
		String[] books = new String[N];
		for(int i = 0; i < N; i++) {
			books[i] = sc.next(); 
		}
		
		
		for(String key : books) {
			sells.put(key, sells.getOrDefault(key, 0)+1);
		}
		
		for(String key : sells.keySet()) {
			int value = sells.get(key);
			
			if(max < value) {
				book = key;
				max = value;
			}
			else if(max == value && book.compareTo(key)>0) {
				book = key;
				max = value;
			}
		}
	System.out.println(book);
	}
}
