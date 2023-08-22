package publicdemo;

public class demo2 extends demo1 implements demointerface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 obj = new demo2();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

	@Override
	protected
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method4");
	}

}
