package testData;

import java.util.HashMap;
import java.util.Map;

public class Revers_String {
	
	
	public void TestString() {
		
		String str="Testdataisgota bug";
		
		String[] st = str.split("");
		
		Map <String,Integer> map=new HashMap<String,Integer>();
		
		
		for (int i = 0; i < st.length; i++) {
			
			System.out.println(i);
			
		}
		
		
		for(String s:st) {
			
			Integer old= map.get(s);
			
			System.out.println(s);
						
		if(old==null) {
			
			old=0;
			
		}
		map.put(str, old+1);
		}
		
		System.out.println(map);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Revers_String ts=new Revers_String();
		
		ts.TestString();
	}

}
