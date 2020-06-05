
public class Tester {

	public static void main(String[] args) {
		double a;
		int b;
		String c;
		String d;
		
		Adder adder = new Adder();
		a = adder.sum(3.3,5.5);
		b = adder.sum(3,5);
		c = adder.sum('a', 'b');
		d = adder.sum("Hello","World");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
