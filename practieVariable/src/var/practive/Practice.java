package var.practive;

import java.util.Scanner;

public class Practice {
	Scanner sc = new Scanner(System.in);

	public void myProfile() {
		
		
	System.out.print("이름 : ");
	String name = sc.next();
	System.out.print("나이 : ");
	int age = sc.nextInt();
	System.out.print("성별 (남 / 여) : ");
	//String gender = sc.next();   //"여" 또는 "남"
	//char gender = s.charAt(0); //'여' , '남'
	char gender = sc.next().charAt(0);
	System.out.print("전화번호 : ");
	String phone = sc.next();
	System.out.print("이메일 : ");
	String email = sc.next();
	
					
		System.out.println("신상정보 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
			
	}
    public void inputEmployee() {
    	
    System.out.println("사번을 입력하시오");
    String empId = sc.next();
   	System.out.println("이름을 입력하시오");
    String empName = sc.next();
    System.out.println("주민번호를 입력하시오");
    String empNo = sc.next();
    System.out.println("급여를 입력하시오");
     int salary = sc.nextInt();
    System.out.println("보너스 지급율을 입력하시오");
     double bonusPct = sc.nextDouble();
    System.out.println("부서명을 입력하시오");
    String deptName = sc.next();
    System.out.println("직급명을 입력하시오");
    String jobName = sc.next();
    		
    		System.out.println("직원 정보 : " + empId + ", "+empName+", "+empNo
    				+", "+salary+", "+bonusPct+", "+deptName+", "+jobName);
    		System.out.println("연봉 : " + (int) ((salary + (salary * bonusPct)) * 12));
    		//계산식에서 먼저 계산하고 싶은 부분은 괄호()로 묶어준다.
    		 		   	
    	
    }
    public void calculator() {
    	System.out.println("첫번째 수");
    	int num1 = sc.nextInt();
    	System.out.println("두번째 수");
    	int num2 = sc.nextInt();
    	
    	System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    	System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    	System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    	System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    	System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
    	
    }
    public void printUnicode() {
    	
    	System.out.print("문자 입력");
    	char ch = sc.next().charAt(0);
    	
    	System.out.println(ch + " is unicode ");
    	
    }
    public void gugudan() {
    	
    	System.out.print("구구단 수");
    	int num1 = sc.nextInt();
//    	System.out.println(num1 + "  * 1 =  " + (num1 * 1 ));
//    	System.out.println(num1 + "  * 2 =  " + (num1 * 2 ));
//    	System.out.println(num1 + "  * 3 =  " + (num1 * 3 ));
//    	System.out.println(num1 + "  * 4 =  " + (num1 * 4 ));
//    	System.out.println(num1 + "  * 5 =  " + (num1 * 5 ));
//    	System.out.println(num1 + "  * 6 =  " + (num1 * 6 ));
//    	System.out.println(num1 + "  * 7 =  " + (num1 * 7 ));
//    	System.out.println(num1 + "  * 8 =  " + (num1 * 8 ));
//    	System.out.println(num1 + "  * 9 =  " + (num1 * 9 ));
    	
    	//위의 출력구문을 반복문 사용으로 바꾼 다음
    	for(int su = 1; su < 10; su++) {
    		System.out.println(num1 + "  * " + su + " =  " + (num1 * su ));
    	}
    }
    public void rectangleCalculator() {
    	
    	System.out.print("사각형 가로 길이");
    	double width = sc.nextDouble();
    	System.out.print("사각형 세로 높이");
    	double height = sc.nextDouble();
    	
    	double area = width * height;
    	double perimeter = (width + height) * 2;
    	
    	System.out.println("면적" + area);
    	System.out.println("둘레" + perimeter);
    	
    	
    	
    	
    }
    
    
	
	
		
	
}
