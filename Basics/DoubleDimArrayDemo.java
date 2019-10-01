public class DoubleDimArrayDemo {
	public static void main(String args[]) {
		int a[][] = {
			{1,2,3},
			{4,5,4},
			{3,2,1}
			};

		int b[][] = {
			{5,4,3},
			{1,2,4},
			{6,2,1}
		};

		int mat[][] = new int[3][3];

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat[i][j] = a[i][j] + b[i][j];
			}
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
