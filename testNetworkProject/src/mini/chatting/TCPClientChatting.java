package mini.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientChatting {

	public static void main(String[] args) {
		// 클라이언트 프로그램
		Scanner sc = new Scanner(System.in);
		String serverIP = null;
		BufferedReader bf = null;
		PrintWriter pw = null;
		Socket socket = null;
		
		try {
			System.out.print("접속할 서버 ip 주소 입력 : ");
			serverIP = sc.next();
			sc.nextLine(); //버퍼에 남은 엔터키 제거함
			
			//소켓 객체 생성이 바로 상대와의 연결임
			socket = new Socket(serverIP, 7000);
			
			//스트림 생성
			bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			//메세지 주고 받기 : 클라이언트가 먼저 보내고 응답 받는 순서로 정했으므로...
			do {
				System.out.print(" > ");
				String sendMessage = sc.nextLine();
				pw.println(sc.nextLine());
				pw.flush();
				
				if(sendMessage.equals("quit")) break;
				
				System.out.println(bf.readLine());
				
			} while(true);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
				pw.close();
				socket.close(); //연결 끊기
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
