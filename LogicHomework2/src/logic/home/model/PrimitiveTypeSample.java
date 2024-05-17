package logic.home.model;

public class PrimitiveTypeSample {
	//기본자료형(Primitive Type) 8개:
	//boolean, byte, short, int, long, float, double, char
	//java.lang 에 기본자료형에 대한 클래스들이 제공됨 : 래퍼(Wrapper) 클래스라고 함
	//Boolean, Byte, Short, Integer, Long, Float, Double, Character
	//기본자료형의 메모리 할당크기, 비트수, 최대값, 최소값 등을 상수필드(public static final)로 제공함
	//기본자료형 값 => 객체로 바꿀 때(boxing), 객체 => 기본자료형 값으로 되돌릴 때(unboxing) 사용함

	public void typeSize() {
		//기본자료형 메모리 할당크기 확인하기
		System.out.println("boolean : 1 byte");
		System.out.println("char : " + Character.BYTES);
		System.out.println("byte : " + Byte.BYTES);
		System.out.println("short : " + Short.BYTES);
		System.out.println("int: " + Integer.BYTES);
		System.out.println("long : " + Long.BYTES);
		System.out.println("float : " + Float.BYTES);
		System.out.println("double : " + Double.BYTES);
		
		
		
	}

	public void minMaxValue() {
		//기본자료형 값의 최소값, 최대값 출력하기
		System.out.println("char : " + Character.SIZE);
	}

	public void bitSize() {
		//기본자료형 비트갯수 확인하기
		
	}

}
