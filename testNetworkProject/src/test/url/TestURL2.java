package test.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TestURL2 {

	public static void main(String[] args) throws IOException {
		// 키보드로 URL 을 입력받아, 프로토콜, 포트번호, 호스트명, 파일경로, 쿼리스트링 출력처리함
		// 단 URL 은 한출씩 입력 받고, URL 앞 뒤에 안보이는 공백 제거
		// url 의 호스트명으로 ip 주소 조회 출력 => 반복 실행 : none 입력시 종료 처리함
		// 키보드 입력은 BufferedReader 사용함
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.print("호스트명(none 입력시 종료됨) : ");
			String host = bf.readLine();
			
			if(host.equals("none"))
				break;
			
			URL url = new URL("https://n.news.naver.com/mnews/article/055/0001133177");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("호스트명 : " + url.getHost());
			System.out.println("파일경로 : " + url.getFile());
			System.out.println("전체경로 : " + url.toExternalForm());
			System.out.println("쿼리스트링 : " + url.getQuery());
			
		} while(true);
		
		
		
		

	}

}
