package Basics_of_java;

public class IF_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks= 90;
		if(marks>90 && marks<=100)
		{
			System.out.println("distinction");

		}
		else if (marks>=70 && marks<=90)
		{
			System.out.println("First class");
		
		}
		else if (marks>=50 && marks<70)
		{
			System.out.println("Second class");
		
		}
		else if(marks>=0  &&  marks<50)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Please enter valid marks");
		}
	}

}
