package Hashmap;

import java.util.HashSet;

public class FoundNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> obj =new HashSet<Integer>();
		{
			obj.add(3);
			obj.add(10);
			//obj.addAll(obj);
		}
		for(int i=1; i<=10; i++)
		{
			if(obj.contains(i)) {
				System.out.println(i + " was found in the set.");
	      } 
		else
	      {
	          System.out.println(i + " was not found in the set.");
	        }
		}
	}

}
