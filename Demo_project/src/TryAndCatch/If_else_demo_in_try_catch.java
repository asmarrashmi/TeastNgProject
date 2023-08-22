package TryAndCatch;

public class If_else_demo_in_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Checkage(20);
	}

	private static void Checkage(int age) {
		// TODO Auto-generated method stub
		if(age<18) {
			throw new ArithmeticException ("Access granted");
		}
		else {
			System.out.println("Access");
		}
	}

}
