


import java.util.*;
import java.io.*;
import java.math.*;

public class B {

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

		String[] input = br.readLine().trim().split(" ");

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		String s = br.readLine();

		int res = findSum(a, b, s);

		System.out.println(res);

	}

	static int findSum(int a, int b, String s) {

		int res = a;
		int n = s.length();
		int countZero = 0;
		int i = 0;
		char[] arr = s.toCharArray();

		int countOne = 0;
		for (char ele : arr)
			if (ele == '1') {
				countOne++;
				break;
			}

		if (countOne == 0)
			return 0;

		for (i = 0; i < n; i++)
			if (arr[i] == '1')
				break;

		for (; i < n; i++) {

			if (arr[i] == '0') {
				countZero++;
			} else {

				if (countZero == 0)
					continue;

				if (countZero * b < a) {
					res += countZero * b;
				} else {
					res += a;
					// if (i == n - 1)
					// 	res += a;
				}

				countZero = 0;
			}
		}
		return res;
	}

}