
public class SpecialIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1, 6, 4 };

		System.out.println(getSpecialIndexCount(arr));
	}
	private static int getSpecialIndexCount(int[] arr) {
		// TODO Auto-generated method stub
		int oddSum = 0, eveSum = 0;
		boolean flag = true;
		for (int num : arr) {
			if (flag)
				oddSum += num;
			else
				eveSum += num;
			flag = !flag;
		}

		int res = 0;

		for (int i = 0; i < arr.length; i += 1) {

			if (i % 2 == 0) {
				System.out.println("even");
				System.out.println("before evensum " + eveSum + " oddsum " + oddSum );
				eveSum -= arr[i];
				System.out.println("after evensum " + eveSum + " oddsum " + oddSum );
				if (eveSum == oddSum)
				{
		
					res += arr[i];
				}
				eveSum += arr[i];
			} else {
				System.out.println("before else evensum " + eveSum + " oddsum " + oddSum );
				oddSum -= arr[i];
				System.out.println("after else evensum " + eveSum + " oddsum " + oddSum );
				if (eveSum == oddSum)
					res += arr[i];
				oddSum += arr[i];
			}
		}
		return res;
	}

}
