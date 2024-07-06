
public class MaximumContinuosMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = { 1, 2, 3, 4, -10 };
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int sum = 0;
		int maxSum = 0;
		for (int num : arr) {
			sum += num;
			if (sum > maxSum)
				maxSum = sum;
			if (sum < 0)
				sum = 0;
		}
		System.out.println(maxSum);
	}

}

//
//Find the maximum sum of contiguous non-empty subarray within an array A of length N.
//
//
//
//Problem Constraints
//1 <= N <= 1e6
//-1000 <= A[i] <= 1000
//
//
//
//Input Format
//The first and the only argument contains an integer array, A.
//
//
//
//Output Format
//Return an integer representing the maximum possible sum of the contiguous subarray.
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 3, 4, -10] 
//Input 2:
//
// A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 
//
//
//Example Output
//Output 1:
//
// 10 
//Output 2:
//
// 6 
//
//
//Example Explanation
//Explanation 1:
//
// The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
//Explanation 2:
//
// The subarray [4,-1,2,1] has the maximum possible sum of 6. 
