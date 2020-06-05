import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlaneTest planetest = new PlaneTest(input);

		int num = -1;
		while (num!=4) {
			System.out.println("***Plane Information***");
			System.out.println("1.Add Info");
			System.out.println("2.Delete Info");
			System.out.println("3.Search Info");
			System.out.println("4.View Info");
			num=input.nextInt();
			if (num==1) {
				planetest.addInfo();				
			}
			else if(num==2) {
				planetest.deleteInfo();
			}
			else if(num==3) {
				planetest.searchInfo();
			}
			else if(num==4) {
				planetest.planeInfo();
			}
			else {
				continue;
			}
		}
	}
}
