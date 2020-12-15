


import java.util.*;
import java.io.*;
import java.math.*;

public class A {

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

		int start = 0, end = n - 1, index = 0;
		int[] arr = new int[n];

		if (n == 1) {
			arr[0] = Integer.parseInt(input[0]);
			System.out.println(arr[0]);
			return;
		}

		while (start < end) {
			arr[index++] = Integer.parseInt(input[start++]);
			arr[index++] = Integer.parseInt(input[end--]);
		}

		if (n % 2 != 0 && n > 2)
			arr[n - 1] = Integer.parseInt(input[(n / 2)]);

		for (int ele : arr)
			System.out.print(ele + " ");
		System.out.println();

	}

}