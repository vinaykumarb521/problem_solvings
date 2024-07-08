import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 6, 9 } };
		int[] merge = { 2, 5 };
		List<int[]> list = new ArrayList<>();
		int i = 0;
		while (i < intervals.length && intervals[i][1] < merge[0]) {
			list.add(intervals[i]);
			i += 1;
		}

		while (i < intervals.length && intervals[i][0] <= merge[1]) {

			merge[0] = Math.min(merge[0], intervals[i][0]);
			merge[1] = Math.max(merge[1], intervals[i][1]);
			i += 1;
		}
		list.add(merge);
		while (i < intervals.length) {
			list.add(intervals[i]);
			i += 1;
		}
		for (int[] interval : list) {
			System.out.println(Arrays.toString(interval));
		}

	}
}
