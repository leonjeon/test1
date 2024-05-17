package make.generics;


//MyGenerics 에 대한 예외클래스 생성

public class SizeOverflowException extends Exception{
	public SizeOverflowException(String message) {
		super(message);
	}
}
