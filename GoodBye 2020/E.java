


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

		long res = 0;

		for (long i : arr) {
			for (long j : arr) {
				for (long k : arr) {
					res  += (i & j ) % MOD * (j  | k ) % MOD;
					res %= MOD;
				}
			}
		}
		System.out.println(res % MOD);
	}

}