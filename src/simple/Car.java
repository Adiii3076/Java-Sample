package simple;

public class Car {
	String color="gary";
	static String engine="v8";
	Car (String tempengine){
	engine =tempengine;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	Car newcar= new Car();
	newcar.printCarcolor();
	newcar.printCarEngine();
	
	Car newcar2= new Car("v10");
     newcar2.printCarcolor();
	newcar2.printCarEngine();
	Car newcar3= new Car();
    newcar3.printCarcolor();
	newcar3.printCarEngine();
	
	
	
			
		


	}void printCarcolor(){
		System.out.println("Car color is "+color);
		
	}
	void printCarEngine() {
		System.out.println(" car enging "+engine);
	}



}
