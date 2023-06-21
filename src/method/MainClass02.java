package method;
/*
 	method
 	- 독립적인 기능을 가지는 작은 프로그램
 	- 또다른 언어에서는 function이라고 표현함
 	- method는 class 안에서 만드는 기능을 말한다.
 	- function은 class가 없는 공간에서 만드는 기능을 말한다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		
		
		TestClass02 te = new TestClass02();
		System.out.println("main 시작");
		te.test(); // 메소드 호출
		System.out.println("main 종료");
		
		
		
		
		
	}
}
