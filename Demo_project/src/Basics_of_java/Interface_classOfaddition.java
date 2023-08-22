package Basics_of_java;

import publicdemo.demo2;

public class Interface_classOfaddition implements Addition_interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_classOfaddition obj = new Interface_classOfaddition();
		obj.Addition();
		obj.mul();
		obj.sub();
		obj.div();
		demo2 object = new demo2();
		object.method4();
	}

	@Override
	public void Addition() {
		// TODO Auto-generated method stub
		int a=5;
		int b=5;
		int c;
		c= a+b;
		{
			System.out.println("Addition= "+c);
		}
		
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=5;
		int b=5;
		int c;
		c= a-b;
		{
			System.out.println("sub= "+c);
		}
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=5;
		int b=5;
		int c;
		c= a*b;
		{
			System.out.println("mul= "+c);
		}
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a=5;
		int b=5;
		int c;
		c= a/b;
		{
			System.out.println("Div= "+c);
		}
	}

}
