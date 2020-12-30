


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

		int[] arr = new int[n];
		int index = 0;
		for (String ele : input)
			arr[index++] = Integer.parseInt(ele);

		if (n == 1) {
			System.out.println(0);
			return;
		} else if (n == 2) {
			System.out.println(1);
			return;
		}

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				set.add(arr[i] - arr[j]);

		System.out.println(set.size());

	}

}