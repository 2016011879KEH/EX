package example;

public class Example {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = new String("Hello Java");
		System.out.println(str1);
		System.out.println(str2);
		
        if (str1.equals(str2)) {
        	System.out.println("equal");
        }
        else {
        	System.out.println("different");
        }

	}

}
