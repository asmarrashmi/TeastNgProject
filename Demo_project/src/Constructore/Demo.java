package Constructore;

public class Demo {
//zero argument constructor
	public Demo() {
		int a=10;
		String name="Rashmi";
		System.out.println(a);
		System.out.println(name);
	}
	// parameterized 
	public Demo(int b, String name1) {
		
		System.out.println(b);
		System.out.println(name1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj =new Demo();
		Demo obj1 =new Demo(20,"V");

	
		
	}

}
