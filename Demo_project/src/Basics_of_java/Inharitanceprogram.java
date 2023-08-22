package Basics_of_java;

public class Inharitanceprogram {

	void speed() {
		System.out.println("good speed");
	}
	void Seat(){
		System.out.println("SUV has 6 seater");
		
	
	}
	public class car extends Inharitanceprogram {
		
		void model() {
			System.out.println("SUV");
		}

		public static void main(String[] args) {
			
			childclass object = new childclass();
			
			object.speed();
			object.model();
			object.Seat();
		}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

	}

