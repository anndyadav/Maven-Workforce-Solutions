import java.util.Arrays;

public class Problem2 {
	/***
	 * Method to find sum of k in an array
	 * 
	 * @param arr array of int containing the numbers
	 * @param k sum to be found in array
	 * @return an array containing the indexes of the numbers whose sum is equal to k
	 */
	int[] findSumIndices(int[] arr,int k) {
		int[] indices = new int[2];
		Arrays.fill(indices, -1);
		int i=0, j=arr.length-1;
		while(i<j) {
			if(k<arr[i]+arr[j]) {
				j--;
			}
			else if(k>arr[i]+arr[j]) {
				i++;
			}
			if(arr[i]+arr[j]==k) {
				indices[0]=i;
				indices[1]=j;
				break;
			}
		}
		return indices;
	}

	public static void main(String[] args) {
		Problem2 obj = new Problem2();
		int[] arr = {1,2,3,4,6};
		System.out.println(Arrays.toString(obj.findSumIndices(arr, 6)));
		int[] arr2 = {2,5,9,11};
		System.out.println(Arrays.toString(obj.findSumIndices(arr2, 11)));
	}

}
