import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		String poem = "Hold fast to dreams" 
		                + " For if dreams die" 
				        + " Life is a broken-winged bird" 
		                + " That cannot fly" 
				        + " Hold fast to dreams" 
		                + " For when dreams go" 
				        + " Life is a barren field" 
		                + " Frozen with snow";
		String[] words = poem.split(" ");
		for (int i = 0; i<words.length; i++) {
			set.add(words[i]);		
		}
		System.out.println(set);
	}
}
