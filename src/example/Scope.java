package example;

public class Scope {

	public static void main(String[] args) {
		int x =5;
		int y =72;
		if (x == 5) {
		    x = 6;
			y = 72;
			System.out.println("x:" + x + " y:" + y);
		}
		System.out.println("x:" + x + " y:" + y);
	}

}
