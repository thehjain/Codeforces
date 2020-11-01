


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
		int n = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);

		String[] A = br.readLine().trim().split(" ");
		String[] B = br.readLine().trim().split(" ");

		String empty = br.readLine();

		int[] a = new int[n];
		int[] b = new int[n];

		int index = 0;
		for (String ele : A)
			a[index++] = Integer.parseInt(ele);
		index = 0;
		for (String ele : B)
			b[index++] = Integer.parseInt(ele);

		if (isPossible(a, b, x, n))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	static boolean isPossible(int[] a, int[] b, int x, int n) {

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0, j = n - 1; i < n; i++, j--)
			if (a[i] + b[j] > x)
				return false;
		return true;
	}

}