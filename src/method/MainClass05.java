package method;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0,sum=0;
		System.out.print("수 입력: ");
		num=sc.nextInt();

		TestClass05 te = new TestClass05();
		te.sumFunc(num);

}
}

