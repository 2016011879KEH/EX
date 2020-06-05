package shapes;

public class Tester {

	public static void main(String[] args) {
		Shape [] shapes = new Shape[3];

		shapes[0] = new Triangle();
		shapes[1] = new Rectangle();
		shapes[2] = new Circle();
		
		for(int i=0; i<shapes.length; i++) {
			shapes[i].draw();
		}
	}
}
