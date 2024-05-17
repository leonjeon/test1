package member.model.dto;

public class Member {
	
//	1. Member 클래스 작성
//	: 회원 정보 클래스
	
				// - Field 구성
	private String id;		//	- id:String	//아이디
	private	String name;		//	- name:String	//이름
	private	String password;		//	- password:String	//패스워드
	private String email;			//	- email:String	//이메일주소
	private	char gender;		//	- gender:char	//성별
	private int	age;		//	- age:int		//나이
	
//	- 디폴트 생성자와 매개변수있는 생성자 2개 작성함
	
	public Member() {}
	

	public Member(String id, String name, String password, String email, char gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}


	
//	 - 각 필드에 대한 setter, getter 메소드 작성함
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
//	 - 메소드 추가 : 필드값 확인용 메소드 (문자열 합치기한 결과 리턴함)
   public String memberInfo() {
	   return "Employee [" + this.id + ", " + this.name + ", " + this.password + ", " + 
   this.email + ", " + this.gender + ", " + this.age +"]";
   }

}
