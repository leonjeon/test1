package beginner.practice;

import java.util.Scanner;

public class ICanDoIt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(" A is unicode : " + (int)ch);
		

	}

}
