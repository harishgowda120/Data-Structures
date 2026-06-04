package COm.rc.array2d;
import java.util.*;
//import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		int[][] arr=MatrixRead.readmat();
		int maxval=Integer.MIN_VALUE;
		
		for(int[] x:arr) {
			for(int y:x) {
				if(y>maxval) {
					maxval=y;
				}
			}
		}
		
		System.out.println(maxval +" is the largest value in the matrix");
		
	}
}
