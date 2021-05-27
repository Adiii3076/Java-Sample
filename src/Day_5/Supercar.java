package Day_5;

public class Supercar {
	int speed1 = 0;
	int minspeed1 = 0;
	int maxspeed1 = 300;
	 
	void maxpeed() {
		System.out.println("Supercar's max speed is : "+maxspeed1);
	}
	void minspeed() {
		System.out.println("SuperCar's min speed is : "+minspeed1);
	}
	void accerlatedspeed() {
		speed1= +3;
		System.out.println(" Accerlated speed is : "+speed1);
	}
	void breakspeed() {
		System.out.println("Car breakspeed is : "+speed1);
	}
	void carstop() {
		speed1=0;
		System.out.println("Car stopped : "+speed1+ "!!!"); 
	}
	}
