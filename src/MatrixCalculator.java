
public class MatrixCalculator {

	public static void main(String[] args) {

		int[][] matrixA = {
				{1, 0, 2},
				{-1, 3, 1}
		};
		int[][] matrixB = {
				{3, 1},
				{2, 1},
				{1, 0}
		};

		int[][] answer = new int[matrixA.length][matrixB[0].length];
	
		for(int i =0; i<answer.length; i++) {
			for(int j =0; j<answer[0].length; j++) {
				for(int k =0; k<matrixA[0].length;k++) {
					answer[i][j] += matrixA[i][k]*matrixB[k][j];
				}
			}
		}
//		for (int i=0; i<answer.length;i++) {
//			for (int j=0; j<answer[i].length;j++) {
				System.out.println(answer[0][0] +"  "+ answer[0][1]);
				System.out.println(answer[1][0] +"  "+ answer[1][1]);
//			}
//		}
	}
}
