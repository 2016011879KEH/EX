package animals;

public class Tester {

	public static void main(String[] args) {
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		
//		cat.bark();
//		dog.bark();
		
		Animal [] animals = new Animal [4];
		
		animals[0] = new Cat();
		animals[1] = new Cow();
		animals[2] = new Dog();
		animals[3] = new Lion();
		
		for(int i=0; i<animals.length;i++) {
			animals[i].bark();
		}

	}

}
