package Basics_of_java;

public class Abstractionclass extends Abstraction {
	  int a=10;
	
	void fish() {
		System.out.println("fish is swim");
		
	}
	  void animal()
		{
			System.out.println("Dog");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractionclass object = new Abstractionclass();
		object.animal();
		object.cat();
		object.fish();
		object.method();
		object.method3();
	}

	@Override
	void method() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
		
			
		}
	void method3() {
		System.out.println("method 3");
	}

}
