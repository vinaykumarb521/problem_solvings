
public class FirstMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 5 };
		int[] arr1 = { 3, 4, -1, 1 };
		int[] arr2 = { 1, 2, 0 };

		System.out.println(findFirstMissingNumber(arr2));

	}

	private static int findFirstMissingNumber(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i += 1) {
			while (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
				int correctPosition = arr[i] - 1;
				int temp = arr[i];
				arr[i] = arr[correctPosition];
				arr[correctPosition] = temp;

			}
		}

		for (int i = 0; i < arr.length; i += 1) {
			if (arr[i] != i + 1)
				return i + 1;
		}
		return arr.length + 1;

	}

}


//Given an unsorted integer array, A of size N. Find the first missing positive integer.
//
//Note: Your algorithm should run in O(n) time and use constant space.
//
//
//
//Problem Constraints
//1 <= N <= 1000000
//
//-109 <= A[i] <= 109
//
//
//
//Input Format
//First argument is an integer array A.
//
//
//
//Output Format
//Return an integer denoting the first missing positive integer.
//
//
//
//Example Input
//Input 1:
//
//[1, 2, 0]
//Input 2:
//
//[3, 4, -1, 1]
//Input 3:
//
//[-8, -7, -6]
//
//
//Example Output
//Output 1:
//
//3
//Output 2:
//
//2
//Output 3:
//
//1
//
//
//Example Explanation
//Explanation 1:
//
//A = [1, 2, 0]
//First positive integer missing from the array is 3.
//Explanation 2:
//
//A = [3, 4, -1, 1]
//First positive integer missing from the array is 2.
//Explanation 3:
//
//A = [-8, -7, -6]
//First positive integer missing from the array is 1.