package logic.testif;

import java.util.Scanner;

public class IfElseSample {
	
	/* if(조건표현식){
	 * 조건의 결과가 true일때 실행할 구문들
	 * }else{
	 * 조건의 결과가 false일때 실행할 구문들
	 * }
	 */
	
	public void testIfElse1() {
		//정수를 하나 입력받아, 짝수이면 "짝수" 라고 출력하고
		//짝수가 아니면 "홀수" 라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num + "짝수");
			
		}else {
			System.out.println(num + "홀수");
		}
		
	}
	public void testIfElse2() {
		//국어,영어,수학 점수를 입력받아, 총점과 평균을 계산하고
		//각 과목별 점수가 각각 40점 이상이고, 평균이 60점 이상이면 "합격" 출력
		//아니면 "불합격" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 국어 : ");
		int kor = sc.nextInt();
		System.out.print(" 영어 : ");
		int eng = sc.nextInt();
		System.out.print(" 수학 : ");
		int mat = sc.nextInt();
		
		int tat = kor+eng+mat;
		double avg = tat / 3;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println(" 합격! ");
		}else {
			System.out.println(" 불합격 ! ");
		}
	}
	public void testIfElse3() {
		/* 두 개의 정수를 입력받아 , 두 수 모두 양수일때만
		 * 두 수의 합, 차, 곱, 몫, 나머지를 계산 출력 처리 하고
		 * 한 개라도 양수가 아니면 "양수가 아닌 값은 계산할 수 없습니다." 출력함
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num1%num2);
			
		}else {
			System.out.println("양수가 아닌 값은 계산할 수 없습니다.");
		}
	}
	public void printMax() {
		//두 개의 정수를 입력받아
		//두 수중 큰 값을 max 변수에, 작은 값을 min 변수에 저장하고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int max,min;
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		System.out.println("큰값 : " + max + "작은값 : " + min);
		
	}

}


























