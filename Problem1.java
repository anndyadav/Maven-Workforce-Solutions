
public class Problem1 {
	/**
	 * Method to return maximum continous sub array sum
	 * 
	 * @param arr array of int containing the numbers
	 * @param k size of subarrays
	 * @return int maximum sum
	 */
	int findMaxContiguousArray(int[] arr,int k) {
		if(arr.length<k) {
			return -1;
		}
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<arr.length-k;i++) {
			int currsum = 0;
			for(int j=i;j<i+k;j++) {
				currsum += arr[j];
			}
			if(currsum>maxSum) {
				maxSum = currsum;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] arr = {2,1,5,1,3,2};
		Problem1 obj = new Problem1();
		System.out.println(obj.findMaxContiguousArray(arr, 3));
		int[] arr2 = {2,3,4,1,5};
		System.out.println(obj.findMaxContiguousArray(arr2, 2));

	}

}
