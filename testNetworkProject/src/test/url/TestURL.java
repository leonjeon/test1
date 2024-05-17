package test.url;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {

	public static void main(String[] args) throws MalformedURLException {
		//java.net.URL test
		URL url = new URL("https://n.news.naver.com/mnews/article/003/0012387652");
		//프로토콜 : 통신규약(통신약속)
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("포트번호 : " + url.getPort());
		System.out.println("호스트명 : " + url.getHost());
		System.out.println("파일경로 : " + url.getFile());
		System.out.println("전체경로 : " + url.toExternalForm());
		
		//실행 결과
//		프로토콜 : https
//		포트번호 : -1
//		호스트명 : n.news.naver.com
//		파일경로 : /mnews/article/003/0012387652
//		전체경로 : https://n.news.naver.com/mnews/article/003/0012387652
	}

}
