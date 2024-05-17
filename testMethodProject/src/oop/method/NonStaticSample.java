package oop.method;

public class NonStaticSample {
	public NonStaticSample(){}
	
		//int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
		//처리할 내용 : 전달받은 정수 갯수만큼의 배열공간을 할당하여, 
		//         임의의 1부터 100사이의 값으로 값 기록하고 주소 리턴함
		//메소드 명 : intArrayAllocation
		//매개변수도 있고 반환값도 있는 메소드
	public int[] intArrayAllocation(int size) {
		int[] ar = new int[size]; //배열 생성
		// 임의의 1부터 100사이의 값으로 값 기록
		for(int i = 0; i < ar.length; i++) { 
			ar[i] = (int)(Math.random() * 100) + 1;
		}
		return ar;
	}
	
		//메소드 명 : display
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : 배열을 전달받아 화면에 출력함
	public void display(int[] ar) {
		for(int i = 0; i < ar.length; i++){ 
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
		return;
	}
	
		//메소드명 : swap
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : 배열과, 두 정수의 인덱스를 전달받아
		//	두 인덱스의 값을 교환함
					
					//배열 , 정수1 , 정수2
	public void swap(int[] ar, int num1, int num2) {
		int num = ar[num1]; //num이라는 변수를 생성해서 실행.
		ar[num1] = ar[num2];
		ar[num2] = num;
		
	}
	
		//메소드명 : sortDescending
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : 위에서 작성한 swap 메소드를 이용하여
		//	배열의 값 들을 내림차순 정렬 처리함
	public void sortDescending(int[] ar) {
		for(int i = 0; i < ar.length; i++) { // i는 비교 기준값이 되는거고
			for(int j = i; j < ar.length; j++) { //j는
				//비교
				//System.out.println(ar[i] +", "+ ar[j]);
				if(ar[i] < ar[j]) {
					this.swap(ar, i, j);
				}
			
			}
		}
	}
	
		//메소드명 : sortAscending
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : swap 메소드를 이용하여 배열의 값들을 오름차순 정렬함
	public void sortAscending(int[] ar) {
		for(int i = 0; i < ar.length; i++) { // i는 비교 기준값이 되는거고
			for(int j = i; j < ar.length; j++) { //j는
				//비교
				//System.out.println(ar[i] +", "+ ar[j]);
				if(ar[i] > ar[j]) {
					this.swap(ar, i, j);
				}
			
			}
		}
	}
		
		
		//1. 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
		//포함된 문자가 없으면 0 리턴함
		//메소드명 : countChar
	public int countChar(String str, char ch) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) { 
			//System.out.println(str.charAt(i));
			if(str.charAt(i) == ch) {
				count++;
			}
			
		}
				
		return count;
	}
		
		
		//2. 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 구해서
		//리턴하는 메소드
		//메소드명 : totalValue
	public int totalValue(int num1, int num2) {
		int max = 0, min = 0, sum = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		for(int i = min; i <= max; i++) { //조건문
			sum += i;
		}
		
		
		return sum;
	}
		
		
		//문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
		//메소명명 : pCharAt
	public char pCharAt(String str, int index) {
		char str1 = str.charAt(index - 1);
		
		
		
		return str1;
	}
	
	
		
		//두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
		//메소드명 : pConcat
	
	public String pConcat(String str1, String str2) {
		
		
		return str1 + str2;
	}
	
	
	
}























