package practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Quiz01 {
	//1
	public String inputFunc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력: ");
		String name= sc.next();
		return name;
	}
	public void printFunc(String name) {
		System.out.println("이름: "+name);
	}
	//2
	public String[] nameInput() {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		for(int i=0;i<3;i++) {
			System.out.print("이름 입력: ");
			name[i]=sc.next();
		}
		return name;
		
	}
	public void nameOutput(String[] name) {
		for(int i=0;i<name.length;i++) {
			System.out.println("이름: "+name[i]);
		}
	}
	//3
	public int[] inputNum() {
		Scanner sc = new Scanner(System.in);
		int[] su = new int[2];
		System.out.print("첫번째 수 입력: ");
		su[0]=sc.nextInt();
		System.out.print("두번째 수 입력: ");
		su[1]= sc.nextInt();
		return su;
	}
	public int sumNum(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	public void printNum(int num1,int num2,int sum) {
		System.out.println("두 수의 합");
		System.out.println(num1+"+"+num2+"="+sum);
	}
	//4
	public ArrayList<Integer> inputNum02() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<2;i++) {
			System.out.print((i+1)+"번째 수 입력: ");
			arr.add(sc.nextInt());
		}
		return arr;
	}
	public int sumNum02(ArrayList<Integer> arr) {
		int sum =0;
		for(int i=0;i<arr.size();i++) {
			sum += arr.get(i);
		}
		return sum;
	}
	public void printNum02(ArrayList<Integer> arr,int sum) {
		System.out.println("==두 수의 합==");
		System.out.println(arr.get(0)+"+"+arr.get(1)+"="+sum);
	}
	//5
	// 이름 나이 주소 입력하고 출력하는 메소드를 만들자
	public LinkedHashMap<String,String> inputFunc02() {
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		
			System.out.println("이름 입력: ");
			map.put("이름",sc.next());
			System.out.println("나이 입력: ");
			map.put("나이",sc.next());
			System.out.println("주소 입력: ");
			sc.nextLine();
			map.put("주소",sc.nextLine());
			
		
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
