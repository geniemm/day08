package method;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass08 {
	public void test1() { // void : return 으로 돌려줄 값이 없다.
		int num = 1;
		if (num == 1) {
			System.out.println("if 실행");
			return;
		}
		System.out.println("다음 문장 실행");
	}

	public String test2(String s) {

		return null;
	}

	public int test3() {
		int num = 1;
		if (num == 1) {
			return 100;
		} else
			return 200;
	}

	public void test4() {
		int num = 1;
		if (num == 1) {
			// return "aaa"
		} else {
			// return 100;
		}
		// return타입은 하나밖에 할수없어서 하나로 정해라 !
	}

	public int[] test5() {
		int n1=100,n2=200;
		int[] arr = {n1,n2};
		return arr;
		// return으로는 여러개의 값을 돌려줄 수 없다.
		
	}
	public HashMap<String,String> test6(ArrayList<String> a) {
		String s = a.get(0);
		System.out.println("0: "+s);
		System.out.println("1: "+a.get(1));
		HashMap<String,String> map = new HashMap<>();
		String re = map.put("키1","값1");
		System.out.println("re: "+re);
		map.put("키2","값2");
		
		return map;
		
	}
	
	
	
	
	
	
	
	
	

}
