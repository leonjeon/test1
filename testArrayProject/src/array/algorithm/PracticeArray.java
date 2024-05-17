package array.algorithm;

import java.util.Random;

public class PracticeArray {
	
	public void lotto() {
		//1~45사이의 임의의 정수를 중복되지 않게 6개 발생시켜 저장
						
		Random r =  new Random();
		int[] ar = new int[6];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
					break;
				}//if
			}//for
		}//for
		
		//오름차순 정렬 처리해서 출력 확인
		
		for(int i = 0; i < ar.length - 1; i++) {
			for(int j = i + 1; j < ar.length; j++) {
				if(ar[i] > ar[j]) {
						//swap
						int temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
				}//if
			}//for
		}//for
		
		//출력확인
		System.out.print("당첨번호 : ");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}//for
		System.out.println();
	}//lotto

}//class
