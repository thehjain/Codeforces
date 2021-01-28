import java.util.*;
import java.io.*;
import java.math.*;

class B {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static FastScanner sc = new FastScanner();
	static StringBuilder sb = new StringBuilder();
	static HashMap<Integer, Boolean> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		int T = sc.nextInt();
		while (T-- > 0) {
			map.clear();
			solve();
		}
		System.out.print(sb);
	}
	static void solve() throws IOException {

		int q = sc.nextInt();
		int d = sc.nextInt();

		int[] arr = new int[q];

		for (int i = 0; i < q; i++)
			arr[i] = sc.nextInt();

		for (int ele : arr) {
			if (ele >= 90 || ele > (d * 10) || ele == d * 10) {
				sb.append("YES" + "\n");
				continue;
			}
			if (isValid(ele, d)) {
				sb.append("YES" + "\n");
			} else
				sb.append("NO" + "\n");
		}

	}

	static boolean isValid(int ele, int d) {

		int n1 = ele;
		boolean ans = false;

		while (n1 > 0) {
			if (n1 % 10 == d) {
				ans = true;
				break;
			}
			n1 /= 10;
		}

		if (!ans) {
			ans = solveUtil(ele, d);
		}

		if (ans)
			return true;
		else
			return false;

	}

	static boolean solveUtil(int ele, int d) {
		while (ele > 0) {
			if ((ele % 10) == d || (ele > 9 && ((ele / 10) % 10) == d))
				return true;
			ele -= d;
		}
		return false;
	}

	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}