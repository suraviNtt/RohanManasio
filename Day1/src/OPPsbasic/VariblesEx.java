package oppsBasic;

public class VariblesEx {
	
	public void method1() {
		System.out.println("method 1");
	}
	
	public void method2() {
		System.out.println("method 2");
	}
	

	public static void main(String[] args) {
		
		//Data Type		
		int number = 20;
		float decimal =  23.56f;
		char letter = 'A';
		String str = "Hello World";
		boolean trueOrFalse = true;
		
		
		//printing to console
		System.out.println(number);
		System.out.println(decimal);
		System.out.println(letter);
		System.out.println(str);
		System.out.println(trueOrFalse);
		
		
		VariblesEx objectName = new VariblesEx();
		objectName.method1();
		objectName.method2();
	}
}
