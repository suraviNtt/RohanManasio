package oppsBasic;

public class A3 {

	private int p = 90;

	private void test1() {
		System.out.println("Protected Method");
	}

	public static void main(String[] args) {

		A3 a3 = new A3();
		a3.test1();
		System.out.println(a3.p);
		
		A2 a2 = new A2();
		a2.test1();
		System.out.println(a2.p);
	}

}
