package game1;

public class Tester {

	public static void main(String[] args) {
		Monster monster = new Monster(0);
		Hunter hunter = new Hunter(0);

		monster.setHp(1000);
		hunter.setPower(100);

		System.out.println("**Monster HP = "+ monster.getHp() +" hp**");
		System.out.println("Hunter attacked Monster with a power of "+hunter.getPower());

		monster.attacked(hunter.getPower());

		System.out.println("Monster has "+ monster.getHp() + " hp");
	}
}
