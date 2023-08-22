package Basics_of_java;

public class addition {
  
 
	final void Sum(int x, int y) {
		int z = x+y;
		System.out.println("sum= " + z);
	}
		
		void Sum(double d,float i) {
			double f= d+i;
			
		System.out.println("sum= " + f);
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition obj = new addition();
		obj.Sum(10,20);
		obj.Sum(2.1,5);
       
	}
}
