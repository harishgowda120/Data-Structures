package COm.rc.array2d;

public class Multiply2matrix {
	public static void main(String[] args) {
		int[][] arr1=MatrixRead.readmat();
		int[][] arr2=MatrixRead.readmat();

		int[][] mul=mutiplyMatrix(arr1,arr2);
		
			for(int[] x:mul) {
				for(int y:x) {
					System.out.print(y+" ");
				}
				System.out.println();
			}
			
		
	}

	private static int[][] mutiplyMatrix(int[][] arr1, int[][] arr2) {
		// TODO Auto-generated method stub
		if(arr1[0].length!=arr2.length)
			return  null;
		
		int[][] mul=new int[arr1.length][arr2[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				for(int z=0;z<arr2.length;z++) {
					mul[i][j]+=(arr1[i][z]*arr2[z][j]);
				}
			}
		}
		return mul;
	}
}
