package method;
/*
 	기본 호출 및 연동
 */
public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		int num=0;
		System.out.println("main");
		num = t.inputFunc(num);
		int sum = t.operData(num);
		t.printData(num,sum);
	}
}
