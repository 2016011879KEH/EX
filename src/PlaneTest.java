import java.util.ArrayList;
import java.util.Scanner;

public class PlaneTest {
	ArrayList<Plane> planes = new ArrayList<Plane>();
	Scanner input;
	Plane plane;
	PlaneTest(Scanner input){
		this.input = input;
	}

	public void addInfo() {
		plane = new Plane();
		plane.getUserInput(input);
		planes.add(plane);
	}

	public void searchInfo() {
		System.out.print("Producer:");
		String producer = input.next();
		int index = -1;
		for (int i =0;i<planes.size();i++) {
			if(planes.get(i).getProducer().equals(producer)) {
				index = i;
				planes.get(i).printInfo();
				break;
			}			
		}
	}

	public void deleteInfo() {
		System.out.print("Producer:");
		String producer = input.next();
		int index = -1;
		for (int i =0;i<planes.size();i++) {
			if(planes.get(i).getProducer().equals(producer)) {
				index = i;
				break;
			}			
		}
		if (index >= 0) {
			planes.remove(index);
			System.out.println("Delete Plane");
		}
		else;		
	}

	public void planeInfo() {
		for (int i=0;i<planes.size(); i++) {
			planes.get(i).printInfo();
		}
		System.out.println("The num of planes= "+planes.size());
	}
}





