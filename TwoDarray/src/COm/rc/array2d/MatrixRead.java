package COm.rc.array2d;
import java.util.*;

public class MatrixRead {
		public static  int[][]  readmat(){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
}
