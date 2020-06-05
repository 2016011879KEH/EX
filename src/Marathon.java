public class Marathon {
	
	int minimum1;
	String runner1;
	int minimum2;
	String runner2;

	void record(int[] times,String[] names) {

		minimum1 = times[0];
		runner1 = names[0];

		minimum2 = times[0];
		runner2 = names[0];


		for(int i=0;i<times.length;i++) {
			if(times[i]<minimum1) {
				minimum1 = times[i];
				runner1 = names[i];
			}
		}

		for(int i=0;i<times.length;i++) {
			if(times[i]>minimum1) {
				if(times[i]<minimum2) {
					minimum2 = times[i];
					runner2 = names[i];
				}
			}
		}		
	}
}



