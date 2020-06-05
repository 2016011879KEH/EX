public class DynamicBinding {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();

		Animal obj;

		obj = a;
		obj.eat();

		obj = d;
		obj.eat();
	}
}
