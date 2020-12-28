


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
		String s = br.readLine();

		char[] arr = s.toCharArray();
		int count = 0;

		for (int i = n - 1; i >= 0; i--)
			if (arr[i] != ')')
				break;
			else
				count++;

		if (count > n / 2)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}