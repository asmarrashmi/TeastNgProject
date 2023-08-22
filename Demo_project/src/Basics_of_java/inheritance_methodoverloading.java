package Basics_of_java;

public class inheritance_methodoverloading extends  methodoverloading{
	
	void div(int v,int r) {
		int s =v/r;
		System.out.println("div= "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance_methodoverloading obj = new inheritance_methodoverloading();
		obj.div(10, 2);
		obj.into(5, 2);
		obj.into(2.2, 0);

	}

}
