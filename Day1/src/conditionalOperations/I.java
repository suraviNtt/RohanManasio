package conditionalOperations;

import oppsBasic.A2;
import oppsBasic.A;
public class I extends A2{

	public static void main(String[] args) {
		
		int i = 6;
		if(i%2 == 0 && i >2 && i%3 !=0) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
		
		
		I iObj = new I();
		iObj.test2();
		
		A a = new A();
		a.test();
		System.out.println(a.i);
		
		
	}
	
}
