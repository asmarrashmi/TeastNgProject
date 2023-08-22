package Encpsulation;

public class Intdemo2 {

	private static final int A=0;
	private static final int B = 0;
	int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intdemo obj = new Intdemo();
		int C = A+B;
		obj.setA(5);
		obj.setB(5);
		//obj.getC();
		System.out.println("c = "+ obj.getC());
	}

}
