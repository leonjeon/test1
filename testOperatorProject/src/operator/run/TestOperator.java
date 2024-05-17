package operator.run;

import operator.sample.BitOperator;

//메인메소드가 포함된 실행용 클래스. 항상 import 선언하기
public class TestOperator {

	public static void main(String[] args) { 
		//연산자 테스트용
		//클래스명 레퍼런스 = new 생성자();
	    //OperatorSample os = new OperatorSample();
	    //레퍼런스.메소드명();
	    //os.괄호연산자테스트();
	    //os.부호연산자테스트();	   
	    //os.증감연산자테스트();
	    //os.형변환연산자테스트();
	    //os.비교연산자테스트();
	    //os.일반논리연산자테스트();
	    //os.일반논리연산자연습();
	    //os.isPositiveNumber();
	    //os.sample1();	    
	    //os.isPass();
	    //os.일반논리연산자특징확인();
	    //os.삼항연산자테스트();
	    //os.삼항연산자중첩사용2();
	    //os.printScoreGrade();
	    //os.isPass2();
	    //os.printGender();
	   // os.isUppercase();    
	    
	    //OperatorSample2 samp2 =new OperatorSample2();
	    //samp2.반올림테스트();
	    //samp2.복합대입연산자테스트();
		
		BitOperator bo = new BitOperator();
		
		//bo.printBits(20);
		//bo.testTield();
	    //bo.testBitLogical();
		bo.testShift();
	    
	}

}
