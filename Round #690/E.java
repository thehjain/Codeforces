


import java.util.*;
import java.io.*;
import java.math.*;

public class E {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			solve();
		}
	}

	static void solve() throws IOException {

		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().trim().split(" ");

		long[] arr = new long[n];
		int index = 0;
		for (String ele : input)
			arr[index++] = Long.parseLong(ele);

		Arrays.sort(arr);
		long res = 0;

		// for (int ele : arr)
		// 	System.out.print(ele + " ");
		// System.out.println();

		int j = 0;

		for (int i = 0; i < n; i++) {

			while (j < n && arr[j] - arr[i] <= 2)
				j++;
			long temp = j - i - 1;
			res += (temp) * (temp - 1) / 2;

			// int j = i + 1;
			// // int count = 0;
			// while (j < n && arr[j] - arr[i] <= 2) {
			// 	//count++;
			// 	j++;
			// }
			// long count = j - i - 1;
			// res += count * (count - 1) / 2;
			// //System.out.println(res);
		}

		System.out.println(res);

	}

	// static long fact(int count) {
	// 	long res = 1;
	// 	for (int i = 1; i <= count; i++)
	// 		res *= i;
	// 	return res;
	// }

}