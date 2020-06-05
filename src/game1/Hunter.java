package game1;

public class Hunter {
	private int power;

	public Hunter(int power){
		this.power = power;
	}
	public int getPower() {
		return this.power;
	}
	public void setPower(int power) {
		this.power = power;
	}

	public int attack() {
		return this.power;
	}

}
