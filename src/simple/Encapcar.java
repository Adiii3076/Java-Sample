package simple;

public class Encapcar {
	
	int speed =0;
	 String color  =" Red";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapcar car =new Encapcar();
	
		
		car.Accs();
		car.stop();
		car.breakspeed();	
	}
	void Accs(){
		speed = speed + 1;
		System.out.println(" Acc speed is : "+speed );
		
	}
	void breakspeed() {
		speed --;
		System.out.println("Breakspeed is : "+ speed);
	}
	void stop() {
		speed =0;
		System.out.println("car stoped  and speed is : "+speed);
		
	}

}
