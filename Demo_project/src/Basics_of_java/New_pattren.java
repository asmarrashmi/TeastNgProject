package Basics_of_java;

public class New_pattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k,l;
		int m=6;
		for(k=1; k<=6; k++)
		{
			for (l=1; l<k; l++)				
			{
				System.out.print(l +" ");					
			}
			System.out.println(l +"");
		}
		System.out.println("------------------------------------------");
//
		int R,V;
		int P=6;
		for(R=P; R>=1; R--)
		{
			for (V=6; V>R; V--)				
			{
				System.out.print(R +" ");					
			}
			System.out.println(R +"");
		}
		System.out.println("------------------------------------------");
		
		//
		
		int a,b;
		for (a=1; a<=6; a++)
			
		{			
				for (b=1; b<a; b++)
				{
					System.out.print("*");
				}
 				System.out.println("*");
			
		}
		
			
		System.out.println("------------------------------------------");
		
	
//

	int c,d;
	for (c=6; c>=1; c--)
	{
		for (d=1; d<c; d++)
		{
			System.out.print(  "*");
		}
		System.out.println("*");
	}
}
}
	

