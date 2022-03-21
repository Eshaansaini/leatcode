import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int [] arr = { 2, 2 ,3 ,6,9};
		int target =5 ;
		int [] arr2 =twoSum( arr , target );
		for(int a : arr2) {
			System.out.println(a);
		}
			

	}

	public static int[] twoSum(int[]arr , int target)
	{   
		int [] newarr = new int [2];
		
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			if(arr[left] + arr[right] == target) {
				newarr[0] = left;
				newarr[1] = right;
			}
			if(arr[left] + arr[right] < target) {
				left++;
			} else {
				right++;
			}
		}
		return newarr;
  }
}
