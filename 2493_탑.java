package com.ssafy.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_2493 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int Cnt = Integer.parseInt(bf.readLine());

		Stack<Integer> top = new Stack<Integer>();
		Stack<Integer> index = new Stack<Integer>();
		
		st = new StringTokenizer(bf.readLine());
		int topFirst = Integer.parseInt(st.nextToken());
		top.push(topFirst);
		index.push(1);
		
		StringBuilder send = new StringBuilder();
		send.append("0");
		for(int i = 2; i <= Cnt; i++) {
			int topNext = Integer.parseInt(st.nextToken());
			while(!top.isEmpty()) {
				if(top.peek() > topNext) {
					send.append(" "+index.peek());
					top.push(topNext);
					index.push(i);
					break;
				}
				else {
					top.pop();
					index.pop();
				}	
			}
			if(top.isEmpty()) {
				send.append(" "+0);
				top.push(topNext);
				index.push(i);
			}
		}
		bw.write(send + "\n");
		bw.flush();
		bw.close();
	}
}
