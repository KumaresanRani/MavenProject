package testData;

import java.util.Iterator;

public class dataAnalyises {
	
int	a=1;
	public void test1() {
		
		System.out.println("Hellow test java");
		
		if(a==1) {
			
			System.out.println("hellow 1==1 true");}
		
		else {
			System.out.println("1==1 is not true");
		}
		
	
		for (int i = 1; i <=5; i++) {
			System.out.println("All is well");
		}
		
		
		
	}
public void test2() {
	
	System.out.println("How are you ?");	
	
}

public void Test3() {
	
	System.out.println("Welcome to the test data project");
	
}

public static void main(String[] args) {
	
	
	dataAnalyises ts=new dataAnalyises();
	
	ts.test1();
	ts.test2();
	ts.Test3();
	
	
	
}
}
