package simple;

public class Supercar {
	int speed = 0;
	int minspeed = 0;
	int maxspeed = 300;
	public static void main(String args[]) {
		 
		Supercar car = new Supercar();
		car.maxpeed();
		car.minspeed();
		car.accerlatedspeed();
		car.breakspeed();
		car.carstop();
		
		
		
	}
	 
	void maxpeed() {
		System.out.println("Supercar's max speed is : "+maxspeed);
	}
	void minspeed() {
		System.out.println("SuperCar's min speed is : "+minspeed);
	}
	void accerlatedspeed() {
		speed= +3;
		System.out.println(" Accerlated speed is : "+speed);
	}
	void breakspeed() {
		System.out.println("Car breakspeed is : "+speed);
	}
	void carstop() {
		speed=0;
		System.out.println("Car stopped : "+speed+ "!!!"); 
	}

	}


