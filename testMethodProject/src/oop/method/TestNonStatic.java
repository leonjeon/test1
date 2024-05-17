package oop.method;

public class TestNonStatic {

	public static void main(String[] args) {
		// 테스트용
		
		NonStaticSample ns = new NonStaticSample();
		
		int[] q = ns.intArrayAllocation(10);
		System.out.println("리턴값 확인 : " + q);
		
		
		
		ns.display(q);
		
		ns.swap(q, 2, 8);
		ns.display(q);
		
		ns.sortDescending(q);
		ns.display(q);
		
		ns.sortAscending(q);
		ns.display(q);
		
		int count = ns.countChar("school" , 'o');
		System.out.println("갯수 : " + count);
		
		int sum = ns.totalValue(11, 10);
		System.out.println("합계 : " + sum);
		
		char ch = ns.pCharAt("apple", 4);
		System.out.println(ch);
		
		String str = ns.pConcat("school","apple");
		System.out.println(str);
		
	}

}
