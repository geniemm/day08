package practice;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	Scanner sc = new Scanner(System.in);
	//1
	
	public int[] inputNum01() {
		
		int[] num = new int[2];
		System.out.print("두 수를 입력: ");
		num[0]=sc.nextInt();
		num[1]=sc.nextInt();
		if(num[0]==num[1])
		{
			System.out.println("두 수가 같습니다.");
			return null;
		}
		return num;
	}
	public int disNum(int[]num) {
		int max;
		if(num[0]>num[1]) {
			max = num[0];
		}
		else {
			max = num[1];
		}
		return max;
	}
	public void printNum01(int max) {
		System.out.println("큰수는 "+max);
	}
	
	//2
	public int inputNum02() {
		System.out.print("수 입력: ");
		int num = sc.nextInt();
		return num;
	}
	public void disNum02(int num) {
		if(num%2==0) {
			System.out.println(num+"은(는) 짝수입니다.");
		}else
			System.out.println(num+"은(는) 홀수입니다.");
	}
	
	//3
	public int[] ranNum03() {
		Random r = new Random();
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i] = r.nextInt(100); // 0~2
		}
		return num;
	}
	public void disNum03(int[] num) {
		for(int i=0;i<num.length;i++) {
			if(num[i]%3==0) {
				System.out.print("3의 배수: ");
				System.out.println(+num[i]);
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
