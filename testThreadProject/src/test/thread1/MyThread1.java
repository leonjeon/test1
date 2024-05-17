package test.thread1;

import javax.swing.JFrame;

//클래스가 하나의 스레드가 되려면, java.lang.Thread 를 상속받으면 된다.
//public class MyThread1 extends Thread {
//다른 클래스가 먼저 상속이 되었다면, Thread 를 상속 못 받는 경우에는 Runnable 인터페이스를 상속받으면 된다.
public class MyThread1 extends JFrame implements Runnable{
	
	// multi thread test
	//Thread 를 상속받은 경우

	//반드시 run() 메서드를 오버라이딩해야한다.
	@Override
	public void run() {
		//해당 스레드가 수행할 내용을 작성한다.
		for(int k = 0; k <= 500; k++) {
			System.out.println("★");
			//스래드의 동작시간을 제어하려면 
			
			try {
				Thread.sleep(100);	//밀리초 단위임, 1000 == 1초임
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
	
}
