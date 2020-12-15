


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
		String s = br.readLine();

		//System.out.println(s.substring(0, 4));

		if (s.substring(0, 4).equals("2020") || s.substring(n - 4, n).equals("2020")) {
			System.out.println("YES");
			return;
		} else if (s.charAt(0) == '2' && s.substring(n - 3, n).equals("020")) {
			System.out.println("YES");
			return;
		} else if (s.substring(0, 2).equals("20") && s.substring(n - 2, n).equals("20")) {
			System.out.println("YES");
			return;
		} else if (s.substring(0, 3).equals("202") && s.charAt(n - 1) == '0') {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}

}