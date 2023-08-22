package TryAndCatch;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				int a = 0;
				int b= 7;
				int c = b/a;
				System.out.println("Enter");
		}
		catch(Exception b) {
			System.out.println("Something went wrong");
			
		}
		try {
			int[] No = {1,2,3,4};
			System.out.println(No[10]);
		}
		catch(Exception e){
			System.out.println("Something went wrong");

		}
		finally {
			System.out.println("finished");
		}
		
	}

}
