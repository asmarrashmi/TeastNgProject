package DataTypes;

public class Javastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CharAt
		String str = "Rashmi";
		char r= str.charAt(3);
		System.out.println(r);
		
		//ToString- convert integer to string
		int x= 5;
		String s= Integer.toString(x);
		System.out.println(Integer.toString(12));
		
		//Sub String 
		String sub = "My work";
		String rs= sub.substring(3);
		System.out.println(rs);
		
		//concat
		String str1= "Ras";
		String str2 = "hmi";
		String concat= str1+str2;
		System.out.println(concat);
		// leanth
		int size= sub.length();
		System.out.println(size);
		
		
		
		
	}

}
