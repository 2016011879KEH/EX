
public class InterfaceTester {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		Phone phone1 = new SmartPhone();
		
		phone.takePicture();
		phone.sendCall();
		
		if (phone instanceof SmartPhone) {
			SmartPhone sphone = (SmartPhone) phone;
			sphone.takePicture();
		}
	}

}
