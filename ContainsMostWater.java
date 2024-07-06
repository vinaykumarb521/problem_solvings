
public class ContainsMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 5, 4, 3 };
		int waterStored = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {

			int area = Math.min(arr[i], arr[j]) * (j - i);
			waterStored = Math.max(waterStored, area);
			if (arr[i] < arr[j])
				i += 1;
			else
				j -= 1;
		}
		System.out.println(waterStored);
	}

}


