package oop.encapsulation;


//클래스 : 자료형이 다른 변수(필드)들의 묶음 + 접근제한기능 추가 => 데이터 보호가 목적
public class Student {
	//멤버변수(Field)
	//Field 작성방법은 : 접근제한자 [예약어] 자료형 변수명 [= 초기값];
	//캡슐화(EnCapsulation)는 클래스 밖에서 필드에 접근 못 하게 하는 것이다.
	//private 이 캡슐화의 기본임
	
	
	private int sno;		//수강생번호 : int  	4byte
	private String name;	//이름 : String			4byte
	private int age;		//나이 : int			4byte
	private String phone;	//전화번호 : String		4byte
	private char gender;	//성별 : char			2byte
	private String major;	//전공 : String			4byte
	private String email;	//이메일 : String		4byte
	private String address;	//집주소 : String		4byte
	private double score;	//시험점수 : double		8byte
											 //총: 38byte
	
	//생성자(Constructor)
	//작성방법 : public 클래스명(){} ==> 매개변수 없는 생성자(기본생성자)
	public Student() {}
	//클래스 안에 생성자가 한 개도 없으면, jvm 에 의해서 자동으로 컴파일시에 기본생성자를 클래스에 추가함
	//기본생성자는 객체 인스턴스 안에 할당되는 필드(인스턴스 변수)에 준비된 기본값으로 초기화됨
	
	//매개변수 있는 생성자 추가 작성 가능함 : 생성자는 오버로딩(overloading) 가능함
	//오버로딩 : 클래스 안에서 이름이 같은 함수를 여러 개 작성하는 것
	//오버로딩시 주의사항 : 매개변수를 다르게 구성해야 함
	public Student(int sno, String name, int age, String phone) {//매개변수 : ()안에 만드는 내용이 매개변수임
		//생성자의 목적 : 객체 생성시(new 할 때) 인스턴스변수 초기화가 목적임
		//필드 = 값; => 필드 = 매개변수;
		//System.out.println("this 가 받은 주소 : " + this.hashCode());
		this.sno = sno; //this가 객체의 주소를 받는다
		this.name = name;
		this.age = age;
		this.phone = phone;
		
	} 
	
	public Student(int sno, String name, int age, String phone,char gender, String major, 
			String email, String address, double score) {
		//생성자의 목적 : 객체 생성시(new 할 때) 인스턴스변수 초기화가 목적임
		//필드 = 값; => 필드 = 매개변수;
		//System.out.println("this 가 받은 주소 : " + this.hashCode());
		this.sno = sno; //this가 객체의 주소를 받는다
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.gender = gender;
		this.major = major;
		this.email = email;
		this.address = address;
		this.score = score;
	} 
	
	//멤버함수 (Method) == 기능
	//작성방법 : 접근제한자 [예약어] 반환자료형 메소드명(){   처리내용   } => 반드시 반환자료형 써야함
	
	//객체 인스턴스 안에 기록된 필드값들 출력 확인
	public void printInformation() {
		//모든 메소드 안에는 this 레퍼런스가 존재함
		//레퍼런스.메소드() 실행시 레퍼런스가 가진 주소를 메소드 안의 this가 자동 전달받음
		//System.out.println("this 가 받은 주소 : " + this.hashCode());
		System.out.println(this.sno + ", " + this.name + ", " + this.age + ", " + this.gender	+ ", "  + this.phone + ", " + this.major + ", " + this.email + ", " + this.address + ", " + this.score);
		
	}
	
	//setter : 필드 값 변경을 목적으로 하는 메소드
	//작성방법 : public void set필드명(자료형 변수명){  this.필드명 = 변수;  }
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setScore(double score) {
		this.score = score;
	}	
	
	//getter : 필드값 조회용 메소드
	//this 위치의 필드값을 읽어서, 요구한 쪽으로 넘겨주는 메소드 (리턴)
	//작성방법 : public 필드자료형 get필드명(){ return this.필드; }
	
	public int getSno() {
		return this.sno;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public double getScore() {
		return this.score;
	}
	
} //class 영역 (보호막)

















