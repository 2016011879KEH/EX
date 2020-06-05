package example;

public class ExFunc {
	
	public static int increaseA(int b) {
		b=b+1;
		return b;
	}

	public static void main(String[] args) {
		int a =45;
		System.out.println("1:" + a);
		a = increaseA(a);
		System.out.println("2:" + a);

	}

}
