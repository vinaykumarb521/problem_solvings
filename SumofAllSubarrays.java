
public class SumofAllSubarrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int sum = sumOfAllSubarrays(arr);
		System.out.println("Sum of all subarrays: " + sum);
	}

	private static int sumOfAllSubarrays(int[] arr) {

		int totalSum = 0;
		for (int i = 0; i < arr.length; i += 1) {
			int curSum = 0;
			for (int j = i; j < arr.length; j += 1) {
				curSum += arr[j];
				totalSum += curSum;
			}

		}
		return totalSum;
	}
}
