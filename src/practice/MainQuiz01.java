package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MainQuiz01 {
	public static void main(String[] args) {
		Quiz01 q = new Quiz01();
//		System.out.println("----1----");
//		String name1 = q.inputFunc();
//		q.printFunc(name1);
//		
//		System.out.println("----2----");
//		String[] name2 = q.nameInput();
//		q.nameOutput(name2);
//		
//		System.out.println("----3----");
//		int[] su = q.inputNum();
//		int sum = q.sumNum(su[0], su[1]);
//		q.printNum(su[0],su[1],sum);
//	
//		System.out.println("----4----");
//		ArrayList<Integer> arr = q.inputNum02();
//		int sum2 = q.sumNum02(arr);
//		q.printNum02(arr, sum2);
		
		System.out.println("----5----");
		LinkedHashMap<String,String> map = q.inputFunc02();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		
		
		
	
	}
}
