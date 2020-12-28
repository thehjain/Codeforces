


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

		int n = Integer.parseInt(br.readLine());
		String[] N = br.readLine().trim().split(" ");
		int m = Integer.parseInt(br.readLine());
		String[] M = br.readLine().trim().split(" ");

		int maxN = 0, maxM = 0;
		int sum = 0;

		for (String ele : N) {
			sum += Integer.parseInt(ele);
			maxN = Math.max(sum, maxN);
		}
		sum = 0;
		for (String ele : M) {
			sum += Integer.parseInt(ele);
			maxM = Math.max(sum, maxM);
		}

		System.out.println(maxM + maxN);

	}

}