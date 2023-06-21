package method;

import java.util.Scanner;

//입력, 출력, 연산하는 기능

public class TestClass07 {
	public void test() {}
		
	public int inputFunc(int num) {
		Scanner sc = new Scanner(System.in);
		num=0;
		System.out.print("수 입력: ");
		return num = sc.nextInt();
		
	}
	public void printData(int num, int sum) {
		System.out.println("1~"+num+"까지의 합: "+sum);
	}
	public int operData(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;	
		
	} return sum;
		
	}
}

