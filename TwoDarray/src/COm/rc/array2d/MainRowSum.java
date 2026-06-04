package COm.rc.array2d;

public class MainRowSum {
	public static void main(String[] args) {
		int[][] arr=MatrixRead.readmat();
		
		int[] rsum=new int[arr.length];
		int[] csum=new int[arr[0].length];
		
//		rowsum
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				rsum[i]+=arr[i][j];
			}
		}
		
		int[] rowbig=rowBiggest(arr);
		
		
		for(int i=0;i<rowbig.length;i++) {
			System.out.println(rowbig[i]+" ");
		}
	}
	
	public static  int[] rowBiggest(int[][] x) {
		int[] big=new int[x.length];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[0].length;j++) {
				
				if(big[i]<x[i][j]) {
					big[i]=x[i][j];
				}
			}
		}
		return big;
	}
	
	
}
