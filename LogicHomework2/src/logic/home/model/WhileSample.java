package logic.home.model;

import java.util.Scanner;

public class WhileSample {
	
	Scanner sc = new Scanner(System.in);

	public void printUniCode() {
		//문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)
		
		while(true) {
			System.out.print("문자 하나 입력 :");
			char ch = sc.next().charAt(0);
			
			if(ch == '0') {
				 break;
			}
			else { 
				System.out.println(ch + " is unicode " + (int)ch);
			}
		}	
			System.out.println("반복종료");
		
	}

	public void sum1To100() {
		//1~100까지 정수들의 합계 출력하기(while 문으로 작성)
		int num = 1;
		int sum = 0;
		
		while(num <= 100) {
			sum += num;
			num++;
		}
		System.out.println(" 1부터 100까지의 합은" + sum + "입니다.");
			
		
		
	}

	public void numberGame() {
		//1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
		//Math.random()은 실수로 밖에 발생시키지 못하기 때문에 *100을 곱해줘야
		//정수로 변형이 되고 앞에(int)를 붙여(형변환) 1~99까지의 정수발생 문제는 100사이기 때문에 마지막 +1
		int value = (int)(Math.random() * 100) + 1;
		
		System.out.println("\n숫자 알아맞추기 게임 시작!");
		int count = 1;
		
		while(true) {
			System.out.print(" 숫자는? ");
			int num = sc.nextInt();
			
			if(value > num) {
				System.out.println("큰 값입니다. ");
			}
			if(value < num) {
				System.out.println(" 작은 값입니다. ");
			}
			if(value == num) {
				System.out.println("축하합니다. " + count + " 번째로 맞췄습니다.");
			break;
			}
		}
		count++;
	}

	public void countCharacter() {
		//문자열을 입력받아, 글자 갯수 알아내어 출력하기
		System.out.println("단어를 입력하시오. ");
		//text변수는 사용자가 입력할 문자
		String text = sc.next();
		//count변수는 개발자가 사용자한테 입력받은 문자의 수를 파악해 출력해야될 변수
		int count = 0;
		while(count < text.length()) {
			count++;
						
		}
			
			System.out.println("" + text + "의 글자 갯수는" + count + "개 입니다.");
		
		
	}

	public void countInChar() {
		//문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기
		
		System.out.println("문자열 하나 입력");
		String iv = sc.next();
		System.out.println("문자 하나 입력");
		char text = sc.next().charAt(0);
		
		int count = iv.length();//길이
		int num = 0;
		char ch;
		int mc = 0;

		while(num < count) {    //while의 변수선언은 밖에서 선언하기
			ch = iv.charAt(num);//문자열 하나하나 쪼개기
			//System.out.println(ch);
			
			if(text == ch) {
				mc++;
			}//if
			num++;
		}//while
		
		System.out.println("문자의 갯수는 ? " + mc);
		
		
	}























}