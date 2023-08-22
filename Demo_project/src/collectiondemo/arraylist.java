package collectiondemo;
import java.util.*;
public class arraylist<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(90);
		obj.add(2, null);
		obj.add(3, null);
		System.out.println(obj.add(30));
	//	obj.add(2, 50);
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
	}

}
