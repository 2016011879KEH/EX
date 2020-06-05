
public class SmartPhone extends PDA implements MobilePhone, Camera{

	@Override
	public void sendCall() {
		System.out.println("sendCall");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("sendSMS");
		
	}

	@Override
	public void playMusic() {
		System.out.println("playMusic");
		
	}

	@Override
	public void takePicture() {
		System.out.println("takePicture");
		
	}


}
