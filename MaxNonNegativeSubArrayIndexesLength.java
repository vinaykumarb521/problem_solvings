
public class MaxNonNegativeSubArrayIndexesLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 5, -7, 2, 3 };
		int start = 0;
		int end = 0;
		int curLen = 0;
		int maxLen = 0;
		for (int i = 0; i < arr.length; i += 1) {

			if (arr[i] >= 0) {
				curLen += 1;
				if (curLen > maxLen) {
					start = i - curLen + 1;
					end = i;
					maxLen = Math.max(maxLen, curLen);
				}
			} else {
				curLen = 0;
			}

		}

		System.out.println(start + " " + end);
	}
	
	

}
