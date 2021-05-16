package simple;



public class Parentcar {
	int speed =0;
	int maxspeed = 100;
	int minspeed = 0;
	String enging ="v8";
	String color =" gray";
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
