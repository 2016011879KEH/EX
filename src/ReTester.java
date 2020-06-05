
public class ReTester {

	public static void main(String[] args) {
		RemoteControl rc1 = new Televison();
		rc1.turnOn();
		rc1.printInfo();
		
		RemoteControl rc2 = new Refrigerator();
		rc1.turnOn();
		rc1.printInfo();
	}

}
