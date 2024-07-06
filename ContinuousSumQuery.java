import java.util.Arrays;

public class ContinuousSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int beggers = 5;
		int[][] range_st_end_money = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };

		int[] output = new int[beggers];
		for (int i = 0; i < range_st_end_money.length; i += 1) {
			for (int j = range_st_end_money[i][0]; j <= range_st_end_money[i][1]; j += 1) {
				output[j - 1] += range_st_end_money[i][2];
			}
		}

		System.out.println(Arrays.toString(output));
	}

}
