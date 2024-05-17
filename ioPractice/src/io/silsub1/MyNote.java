package io.silsub1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;

public class MyNote {
//	<문제 1>
//	 : 문자기반스트림과 보조스트림으로 버퍼이용스트림 클래스를 사용하시오.
//	 - 패키지명 : io.silsub1
//	 - 클래스명 : MyNote.java	
//	 - Field : - sc:Scanner	//초기화 생성함
	private Scanner sc = new Scanner(System.in);

	
//	 - Constructor : default
	public MyNote() {}
	
//	
//	- Method
//	+ fileSave():void
	public void fileSave() {

//		1. "파일에 저장할 내용을 입력하시오"  출력
		System.out.print("파일에 저장할 내용을 입력하시오.");
		String text = sc.next();
		
//		2. StringBuilder 를 사용하여 문자열을 반복해서 입력받아 추가함
		StringBuilder sb = new StringBuilder(text);
//		3. "exit" 입력되면 반복 종료함
		while((text = sc.nextLine()).equals("exit") != true) {
			sb.append(text);
		}
			System.out.println(sb);

//		4. "저장하시겠습니까? (y/n) : " 출력
			System.out.print("저장하시겠습니까? (y/n) : ");
//		5. 입력값이 대소문자 상관없이 'Y' 이면, "저장할 파일명 : " 출력
			if(sc.next().toUpperCase().charAt(0) == 'Y') {
				System.out.print("저장할 파일명 : ");
			}
//		6. 파일명 입력받아, 해당 파일에 출력 기록함.
			String fileName = sc.next();
//		7. "oooo.txt 파일에 성공적으로 저장하였습니다." 출력
			
			//스트림생성
			BufferedWriter bw = null;
			try {
				 
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
			
			
//		8. 스트림 반납하고 리턴함
		
		
		
		
	}
//	+ fileOpen():void
	public void fileOpen() {
		
//		1. "열기할 파일명 : " 출력하고, 파일명 입력받음
		System.out.print("열기할 파일명 : ");
		String fileName = sc.next();
		
		FileReader fr = null;		
//		3. 파일의 내용을 한 줄씩 읽어서 화면에 출력함
//		4. 스트림 반납하고 리턴
		try {
//			2. 파일 입력 스트림 생성
			fr = new FileReader(fileName);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
//	+ fileEdit():void
	public void fileEdit() {
//		
//		1. "수정할 파일명 : " 출력하고, 파일명 입력받음
		System.out.print("수정할 파일명 : ");
//		2. 파일 입력 스트림 생성
		String fileName = sc.next();
//		3. 파일 출력 스트림 생성 : 단, 기존 내용 둔 상태로 생성할 것
//		4. 파일의 내용을 읽어, StringBuilder 에 저장
		StringBuilder sb = new StringBuilder();
		sb.append(fileName);
//		5. "파일에 추가할 내용을 입력하시오." 출력하고, 추가할 내용 입력받음
		System.out.println(fileName + "파일에 추가할 내용을 입력하시오.");
//		6. 추가내용을 StringBuilder 에 추가함 : 반복
		
//		7. "exit" 입력하면 반복 종료함
		//String 변수하나 생성해서 while문으로 조건작성
		String data;
		
		while((data = sc.nextLine()).equals("exit") != true) {
			
		}
//		8. "변경된 내용을 파일에 추가하시겠습니까? (y/n) : " 출력
		System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
//		9. 대소문자 상관없이 'Y'이면, 파일에 기록함
		if(sc.next().toUpperCase().charAt(0) == 'Y') {
			fileName = sc.next();
		}
//		10. "ooo.txt 파일의 내용이 변경되었습니다." 출력
		System.out.println("ooo.txt 파일의 내용이 변경되었습니다.");
		
//		11. 스트림 반납하고 리턴함
		
		
		
	}
	
}
























