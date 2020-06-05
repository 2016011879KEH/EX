package example;

import java.util.ArrayList;
import java.util.HashSet;

public class Pizza {

	public static void main(String[] args) {
		HashSet<String> values = new HashSet<String>();
		values.add("Pepperoni");
		values.add("Mushrooms");
		values.add("Onions");
		values.add("Sausage");
		values.add("Bacon");
			 
		
		for (String val : values) {
			System.out.println(val);
		}

	}

}
