
//Add to Neihbour And Remove

import java.util.*;
import java.io.*;
import java.math.*;

public class D {

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

		int[] arr = new int[n];
		int index = 0;

		for (String ele : input)
			arr[index++] = Integer.parseInt(ele);

		int res = MAX;

		int prefixSum = 0;
		for (int i = 0; i < n; i++) {
			prefixSum += arr[i];
			int sum = 0;
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				sum += arr[j];
				if (sum == prefixSum) {
					count++;
					sum = 0;
				} else if (sum > prefixSum)
					break;
			}
			if (sum == 0)
				res = Math.min(res, n - count - 1);
		}

		System.out.println(res);

	}

}