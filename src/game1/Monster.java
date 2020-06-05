package game1;

public class Monster {
	private int hp;

	public Monster(int hp){
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void attacked(int power) {
		this.hp = hp - power;
	}

}
