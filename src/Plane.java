import java.util.Scanner;

public class Plane {

	protected String producer;
	protected String model;
	protected int maxpassengerNum;
	protected static int planes = 0;
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer=producer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public int getMaxNum() {
		return maxpassengerNum;
	}
	public void setMaxNum(int maxpassengerNum) {
		this.maxpassengerNum=maxpassengerNum;
	}
	public Plane() {
	}

	public Plane(String producer,String model,int maxpassengerNum){
		this.producer=producer;
		this.model=model;
		this.maxpassengerNum=maxpassengerNum;
		
	}
	public static int getPlanes() {
		return planes;
	}
	
	public void printInfo() {
		System.out.println("Producer: "+producer+" Model: "+model+" Passenger MaxNum: "+maxpassengerNum);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Producer:");
		String producer = input.next();		
		this.setProducer(producer);
		
		System.out.print("Modle:");
		String model = input.next();		
		this.setModel(model);
		
		System.out.print("MaxNum passenger:");
		int maxpassengerNum = input.nextInt();		
		this.setMaxNum(maxpassengerNum);
	}

}



