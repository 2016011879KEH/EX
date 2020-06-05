public class RunnerRecord {

	public static void main(String[] args) {
		Marathon marathon = new Marathon();

		String[] names = {
				"Elena","Thomas","Hamilton","Suzie","Phil","Matt",
				"Alex","Emma","John","James","Jane","Emily",
				"Daniel","Neda","Aaron","Kate"
		};

		int[] times = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334,
				412, 393, 299, 343, 317, 265
		};

		marathon.record(times,names);

		for(int i=0;i<times.length;i++) {
			System.out.println(names[i]+":"+times[i]);
		}

		System.out.println("The Fastest runner is "+marathon.runner1 +":"+marathon.minimum1);
		System.out.println("The Second fastest runner is "+marathon.runner2+":"+marathon.minimum2);
	}

}
