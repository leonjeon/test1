package array2.model;

public class Student {
	//Field
	private char sclass;	//반 클래스 종류 : A, B, C 클래스로 분류
	private String sname;	//학생이름
	private int score;      //점수
	
	
	//Constructor
	
	public Student() {}


	public Student(char sclass, String sname, int score) {
		super();
		this.sclass = sclass;
		this.sname = sname;
		this.score = score;
	}


	public char getSclass() {
		return sclass;
	}


	public void setSclass(char sclass) {
		this.sclass = sclass;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	//method
	public String studentInformation() {
		return "Student[" + this.sclass + ", " + this.sname + ", " + this.score +"]";
	}
}
