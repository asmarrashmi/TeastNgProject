package Hashmap;

import java.util.HashMap;

public class hashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> cities = new HashMap<String ,String>();
		
		cities.put("1", "Mumbai");
		cities.put("GJ", "Gandhinagar");
		cities.put("3", "Nvs ");
		
		System.out.println(cities.containsKey("GJ"));
		//System.out.println(cities);
		cities.get("1");
		System.out.println(cities.get("1"));
		//cities.clear();
		//System.out.println(cities);
		//cities.entrySet();
		cities.equals(cities);
		System.out.println(cities.entrySet());
	}

}
