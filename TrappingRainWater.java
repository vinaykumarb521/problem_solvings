
public class TrappingRainWater {

	public static void main(String[] args) {

		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int leftMax = arr[0];
		int rightMax = arr[arr.length - 1];
		int left = 0, right = arr.length - 1;
		int sum = 0;
		while (left < right) {

			if (arr[left] < rightMax) {
				sum += Math.min(leftMax, rightMax) - arr[left];
				left += 1;
			} else {
				sum += Math.min(leftMax, rightMax) - arr[right];
				right -= 1;
			}

			leftMax = Math.max(leftMax, arr[left]);
			rightMax = Math.max(rightMax, arr[right]);
		}
		System.out.println(sum);
	}
}



//Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
//
//
//
//Problem Constraints
//1 <= |A| <= 100000
//
//
//
//Input Format
//First and only argument is the vector A
//
//
//
//Output Format
//Return one integer, the answer to the question
//
//
//
//Example Input
//Input 1:
//
//A = [0, 1, 0, 2]
//Input 2:
//
//A = [1, 2]
//
//
//Example Output
//Output 1:
//
//1
//Output 2:
//
//0
//
//
//Example Explanation
//Explanation 1:
//
//1 unit is trapped on top of the 3rd element.
//Explanation 2:
//
//No water is trapped.
