


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

		String s = br.readLine();

		if (s.length() % 2 != 0) {
			System.out.println("NO");
			return;
		}

		char[] arr = s.toCharArray();

		int countQues = 0;

		for (char ele : arr)
			if (ele == '?') countQues++;

		if (arr[0] == ')')
			System.out.println("NO");
		else if (arr[s.length() - 1] == '(')
			System.out.println("NO");
		else if (countQues % 2 != 0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}