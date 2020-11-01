


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

		String[] input = br.readLine().trim().split(" ");

		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[1]);

		//System.out.println(System.currentTimeMillis());

		if (a < b || a % b != 0)
			System.out.println(a);
		else {
			for (int i = 1; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					if (a / i == i && i % b != 0) {
						System.out.println(i);
						break;
					} else {
						if ((a / i) % b != 0) {
							System.out.println(a / i);
							break;
						}
					}
				}
			}
		}

		//System.out.println(System.currentTimeMillis());

		return;
	}

}