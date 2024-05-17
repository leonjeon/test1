package test.objectio;

public class TestObjectIO {

	public static void main(String[] args) {
		// 객체를 파일에 저장하는 객체입출력 스트림 사용 테스트
		Member[] array = new Member[] {
				new Member("홍길동", 29, '남', "hong77@test.org", "010-1234-5678", 13500.0),
				new Member("동길순", 23, '여', "kong88@rest.org", "010-9876-4321", 25120.7),
				new Member("강감찬", 35, '남', "kang99@test.org", "010-9999-5678", 78400.0)
		};
				
		MemberManager manager = new MemberManager(array);
		
		//manager.fileSave();
		manager.fileRead();
		
		
	}

}
