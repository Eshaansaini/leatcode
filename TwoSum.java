import java.util.HashMap;

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
	{   HashMap<Integer,Integer> map = new HashMap<>();
		int [] result = new int[2];
		for(int i = 0 ; i <arr.length ; i++) {
		 if(map.containsKey(arr[i])) {
			 result[1]=i;
			 result[0]=map.get(arr[i]);
			 return result;
		 }
		 map.put(target-arr[i],i);	
		}
		return result;
  }
}
