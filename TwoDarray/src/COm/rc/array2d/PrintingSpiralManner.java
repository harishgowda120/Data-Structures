package COm.rc.array2d;

public class PrintingSpiralManner {	
		public static void main(String[] args) {
			int[][] arr=MatrixRead.readmat();
			
			for(int i=0,j=arr.length-1;i<j;i++,j--) {
				for(int k=i;k<j;k++) {
					System.out.print(arr[k][i]+" ");
				}
				for(int k=i;k<j;k++) {
					System.out.print(arr[j][k]+" ");
				}
				for(int k=j;k>i;k--) {
					System.out.print(arr[k][j]+" ");
				}
				for(int k=j;k>i;k--) {
					System.out.print(arr[i][k]+" ");
				}
			}
		}
}
