package premitive.Array.Sample;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	
	public void test1() {
		
		//1. 10개의 int 배열 선언하고 할당함
		//2. 각 방에 1~100사이의 임의의 난수를 기록함
		//java.util.Random 클래스 사용함
		//3. 10개의 정수들의 합계를 구하여 출력함
		
		int[] ar = new int[10];
		Random r = new Random();
		int sum = 0;
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(100) + 1;
			sum += ar[i];
			System.out.println("ar[" + i + "]" + ar[i]);
		}//for
		System.out.println("sum : " + sum);
	}//test1
	
	public void test2() {
		//1. 10개의 int[] 선언, 할당함
		//2. 1~100사이의 임의의 정수를 발생시켜, 배열공간에 기록함
		//   배열[인덱스] = (int)(Math.random() * 100) + 1;
		//3. 기록된 10개의 값중 가장 큰 값과 가장 작은 값을 알아내어
		//4. 출력확인
		
		int[] num = new int[10];
		int max = 0, min = 100;
		//
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
			if(max < num[i]) {
				max = num[i];
				
			}//if
			if(min > num[i]) {
				min = num[i];
			}//if
			System.out.print(num[i] + "\t");
		
		}//for
		System.out.println();
		System.out.println("가장 큰 값은 : " + max);
		System.out.println("가장 작은 값은 :" + min);
	}//test2
	
	public void test3() {
		//1. 10개의 byte[] 선언, 할당함
		//2. byte 자료형 범위에 속하는 임의의 난수를 발생시켜
		//   각 변수방에 기록함 : Random 클래스의 메소드 사용함
		//3. 기록된 10개의 값 중 짝수들의 합계만 구하여 출력함.
		
		//상우 버전
//		Random rd = new Random();
//		
//		byte[] bt = new byte[10];
//		int tot = 0;
//		
//		for(int i = 0; i < bt.length; i++) {
//			bt[i] = (byte)(rd.nextInt(-128, 127));
//			
//			if(bt[i] % 2 == 0) {
//				tot += bt[i];
//				System.out.println("bt[" + i + "]" + bt[i]);
//			}//if
//		}//for
//		System.out.println();
//		System.out.println("짝수들의 합 : " + tot);
		
		//강사님 버전
		byte[] bar = new byte[10];
		int evenSum = 0;
		
		new Random().nextBytes(bar);
		
		for(int i = 0; i < bar.length; i++) {
			System.out.print(bar[i] + "\t");
			
			if(bar[i] % 2 == 0) {
				evenSum += (bar[i] < 0 ? Math.abs(bar[i]) : bar[i]);
			}//if
		}//for
			
			System.out.println();
			System.out.println("");
		
	}//test3
	
	
	public void test4() {
		//숫자로 된 문자열을 입력받아, 각 자리의 숫자들의 합을 구하여 출력
		//ex>
		//문자열 입력 : 12345 //String 클래스의 substring() 메소드 사용
		//합계 : 15
		int sum = 0;
		
		System.out.print("숫자문자열 입력 : ");
		String value = new Scanner(System.in).next();
		
		for(int i = 0; i < value.length(); i++) {
			//String num = value.substring(i, i+1); //"8" -> 8
			//String 형태의 기본자료형 값을 => 실제 계산이 가능한 기본자료형 값으로
			//바꾸는 것 : 파싱(parsing) >> java.lang 패키지에 Wrapper 클래스에서 제공됨
			//각 자료형별로 "false" -> false : Boolean.parseBoolean("false")
			//"7" -> 7 : Integer.parselnt("7")
			//"3.5" -> 3.5 : Double.parseDouble("3.5")
			sum += Integer.parseInt(value.substring(i, i+1));
		}//for
		
			System.out.println("합계 : " + sum);
		
		
	}//test4
	
	
	public void test5() {
		//숫자로 된 문자열을 입력받아, 각 자리의 숫자들의 합을 구하여 출력
		//ex>
		//문자열 입력 : 12345 //String 클래스의 charAt() 메소드 사용
		//합계 : 15
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자문자열 입력 : ");
		String inputValue = scan.next();
		
		for(int i = 0; i < inputValue.length(); i ++) {
			//String 클래스의 charAt(index) 메소드 사용한 경우
			sum += inputValue.charAt(i) - 48;
		}//for
		
		System.out.println("합계 : " + sum);
		
		
	}
	
	public void test6() {
//		1. 문자열 변수 초기화 
//		String personID = "881225-1234567";
//		2. 문자열에서 생년, 생월, 생일, 성별에 대한 값을 분리 추출함
//		String 클래스의 substring() 메소드 사용
//		3. java.util 패키지의 날짜 관련 클래스
//		(Date 또는 Calendar 또는 GregorianCalendar)를 사용해서
//		추출한 생년월일 값으로 날짜 데이터를 만듦
//		4. 생일의 요일이 무슨 요일이었는지 제공되는 메소드를 사용해서 확인출력
//		5. 성별값이 1이면 남자, 2이면 여자라고 출력함
//		6. 날짜 데이터로 바꾼 값에서 년도만, 오늘 날짜의 년도를 빼서 나이 계산 출력함
//		
		String personId = "881225-1234567";
		
		int birthYear = Integer.parseInt(personId.substring(0,2));
		int birthMonth = Integer.parseInt(personId.substring(2,4));
		int birthDay = Integer.parseInt(personId.substring(4,6));
		// 1. char gender = personId.substring(7,8).charAt(0); 
		char gender = personId.charAt(7);
		System.out.println(birthYear + ", " + birthMonth + ", " + birthDay + ", " + gender);
		
		GregorianCalendar birth = new GregorianCalendar(birthYear + 1900, birthMonth - 1, birthDay);
		System.out.println(birth);
		
		switch(birth.get(Calendar.DAY_OF_WEEK)) {
		case 1 : System.out.println("일요일");	break;
		case 2 : System.out.println("월요일");	break;
		case 3 : System.out.println("화요일");	break;
		case 4 : System.out.println("수요일");	break;
		case 5 : System.out.println("목요일");	break;
		case 6 : System.out.println("금요일");	break;
		case 7 : System.out.println("토요일");	break;
		}//switch
		
		System.out.println("성별 :" + (gender == '1' ? "남자" : "여자"));
		
		int bYear = birth.get(Calendar.YEAR);
		int todayYear = new GregorianCalendar().get(Calendar.YEAR);
		System.out.println(bYear + ", " + todayYear);
		
		System.out.println("현재 나이 : " + (todayYear - bYear));
		
		//System.out.println(new Date());
		//System.out.println(new GregorianCalendar());
		//System.out.println(Calendar.getInstance());
			
	}//test6



























}//class
