package oppsBasic;

public class A1 extends A {

	
	protected int p = 90;
	
	protected void test1() {
		System.out.println("Protected Method");
	}
	
	public void test() {
		System.out.println("A1 Test");
	}
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.test();
		a1.test1();
		a1.test("Roshan");
		a1.test(10);
		a1.test(20, 10);
		
		A a = new A1();
		a.test(); // Overridden by child test() - runtime ploymorphism
		
		A a2 = new A();
		a2.test();
	}
}

