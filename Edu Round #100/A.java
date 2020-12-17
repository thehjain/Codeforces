


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

		String[] input = br.readLine().trim().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		int sum = a + b + c;
		int count = 0;

		if (sum % 9 != 0) {
			System.out.println("NO");
			return;
		}
		count = sum / 9;

		if (a >= count && b >= count && c >= count)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}