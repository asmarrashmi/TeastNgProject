package Basics_of_java;

 abstract class Abstraction {
// non-abstract method
	  void animal()
	{
		System.out.println("Dog");
	}
	void cat() {
		System.out.println("cat is eting");
	}
	// abstract method
	abstract void method();
	abstract void method3();
}