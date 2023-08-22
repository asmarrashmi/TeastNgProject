package Basics_of_java;
import java.io.*;
import java.util.Date;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srt= "My_word";
		char R= srt.charAt(3);
		System.out.println(R);
		
		   int x = 5;
		   String str1 = Integer.toString(x);// x+""
		   System.out.println(str1);  
		      System.out.println(Integer.toString(12)); 
		      
		      String str2 = "i love java";
				System.out.println(str2.substring(2, 6));
				
				String str4= "      my  word";
				System.out.println(str4.trim());
				
				String str5 = "i Love";
				String str6 = "i love";
				System.out.println(str5.concat(str6));
				
				String str9 = "I love \"Java@\"";
				System.out.println(str9);


	}
	
	

}
