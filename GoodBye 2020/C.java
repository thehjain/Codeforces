


import java.util.*;
import java.io.*;
import java.math.*;

public class C {

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

		char[] arr = br.readLine().toCharArray();

		int n = arr.length;
		int count = 0;

		for (int i = 1; i < n; i++) {

			if (arr[i] == arr[i - 1] && arr[i - 1] != '?') {
				arr[i] = '?';
				count++;
			}
			if (i > 1) {
				if (arr[i] == arr[i - 2] && arr[i - 2] != '?') {
					arr[i] = '?';
					count++;
				}
			}

		}
		System.out.println(count);
	}

}