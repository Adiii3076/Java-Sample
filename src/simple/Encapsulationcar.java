package simple;

public class Encapsulationcar {
	
      int speed =0;
     String color =" black ";
	public static void main(String[] args) {
         
		Encapsulationcar car = new Encapsulationcar();
		car.color="green";
		System.out.println("Car Current speed "+car.speed);
		car.accesepeed();
		car.accesepeed();
		car.breaksepeed();
		car.breaksepeed();
	}
	void accesepeed() {
		speed = speed +1 ;
		System.out.println(" Accerlate speed is : "+speed);
	}
	void breaksepeed() {
		speed -- ;
		System.out.println(" Break speed is : "+speed);
	}
	void Stopsepeed() {
		speed = 0  ;
		System.out.println(" Car stopped : "+speed);
	}
	

}
