package simple;

public class Supercar1 {
	int speed = 0;
	int minspeed = 0;
	int maxspeed = 300;
	 
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