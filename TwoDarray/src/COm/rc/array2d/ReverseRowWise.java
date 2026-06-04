package COm.rc.array2d;

public class ReverseRowWise {
	public static void main(String[] args) {
		int[][] arr=MatrixRead.readmat();
		
		
//		column wise reverse and row wise
//		for(int i=0;i<arr.length;i++) {
//			int l=0,h=arr[i].length-1;
//			while(l<h) {
//				int t=arr[l][i];
//				arr[l][i]=arr[h][i];
//				arr[h][i]=t;
//				l++;h--;
//			}
//		}
		
//		diagonal wise reverse
		
		int l=0,h=arr.length-1;
		while(l<h) {
			int t=arr[l][l];
			arr[l][l]=arr[h][h];
			arr[h][h]=t;
			
			t=arr[h][l];
			arr[h][l]=arr[l][h];
			arr[l][h]=t;
			l++;h--;
		}
		
		diagonalSum(arr);
		
		for(int[] x:arr) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}
	public static void diagonalSum(int[][] x) {
		int psum=0,ssum=0;
		int l=0,h=x.length-1;
		for(int i=0;i<x.length;i++){
			psum+=x[l][l];
			ssum+=x[l][h];
			l++;
			h--;
		}
		System.out.println("primary sum: "+psum+" secondary sum: "+ssum);
	}
	
}
