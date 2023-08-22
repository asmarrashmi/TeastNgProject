package Basics_of_java;

public class methodoverloading {
	void into  (int x,int y)
	{
		int z= x*y;
		System.out.println("into = "+ z );
	}
	void into (double a,float b)
	{
		double z= a*b;
		System.out.println("into = "+ z );
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		methodoverloading obj= new methodoverloading();
		obj.into(2, 0);
		obj.into(0.1, 0);
	}

}
