package test;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("N�Է� >> ");
		int N = sc.nextInt();
		System.out.println("X�Է� >> ");
		int X = sc.nextInt();
		int [] array = new int[N];
		
		for(int i=1; i<=N;i++) {
				System.out.println(i+"��° ���� �Է� >> ");
				int score = sc.nextInt();
				array[i] = score;
				
			}
		for(int j=0;j<array.length;j++) {
			
			
		}

	}

}
