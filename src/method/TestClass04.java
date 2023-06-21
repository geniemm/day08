package method;

import java.util.Scanner;

public class TestClass04 {
	// method이름 : 소문자로 시작, 합성어는 대문자로 시작
	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num=0,sum=0;
		System.out.print("수 입력: ");
		num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			sum+=i;
			
		}
		System.out.println("1~"+num+"까지의 합: "+sum);

	}
	
}
