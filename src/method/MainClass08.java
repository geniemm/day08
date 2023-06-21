package method;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 t = new TestClass08();
		t.test1();
		String a = t.test2("aa");
		
		int[] b = t.test5();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		ArrayList<String> ar = new ArrayList<>();
		ar.add("안녕");
		ar.add("하");
		HashMap<String,String> map = t.test6(ar);
		System.out.println(map);
		
	}


}
