package COm.rc.array2d;
import java.util.*;
public class MatPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		System.out.println(list.get(0)); 
	}
	
	public static int binarySearch(int[] arr, int val, int lo, int hi) {

	    if(lo > hi)
	        return -1;

	    int mid = lo + (hi - lo) / 2;

	    if(arr[mid] == val)
	        return mid;

	    if(val > arr[mid])
	        return binarySearch(arr, val, mid + 1, hi);

	    return binarySearch(arr, val, lo, mid - 1);
	}
}
