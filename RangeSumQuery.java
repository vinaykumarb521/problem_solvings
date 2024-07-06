import java.util.Arrays;

public class RangeSumQuery {

    public static int[] getOutput(int position, int start, int end, int[] inputA, int[] output) {
        int sum = 0;
        for (int i = start; i <= end; i += 1) {
            sum += inputA[i];
        }
        output[position] = sum;
        return output;
    }

    public static void main(String[] args) {

        int[] inputA = { 2, 2, 2};
        int[][] inputB = { {0, 0}, {1, 2}};
        int[] output = new int[inputB.length];
        for (int i = 0; i < inputB.length; i += 1) {
            getOutput(i, inputB[i][0], inputB[i][1], inputA, output);
        }
        System.out.println(Arrays.toString(output));

    }
}

// You are given an integer array A of length N.
// You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
// For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
// More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.



// Problem Constraints
// 1 <= N, M <= 105
// 1 <= A[i] <= 109
// 0 <= L <= R < N


// Input Format
// The first argument is the integer array A.
// The second argument is the 2D integer array B.


// Output Format
// Return an integer array of length M where ith element is the answer for ith query in B.



// Input 1:
// A = [1, 2, 3, 4, 5]
// B = [[0, 3], [1, 2]]
// Input 2:

// A = [2, 2, 2]
// B = [[0, 0], [1, 2]]


// Example Output
// Output 1:
// [10, 5]
// Output 2:

// [2, 4]