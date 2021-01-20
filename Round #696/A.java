import java.util.*;
import java.io.*;
import java.math.*;

class A {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static FastScanner sc = new FastScanner();

	public static void main(String[] args) throws IOException {
		int T = sc.nextInt();
		while (T-- > 0) {
			solve();
		}
	}

	static void solve() throws IOException {

		StringBuilder res = new StringBuilder();

		int n = sc.nextInt();
		String s = sc.next();
		for (int i = 0; i < n; i++) {
			if (i == 0)
				res.append(1);
			else {
				int temp = (s.charAt(i - 1) - '0') + (res.charAt(res.length() - 1) - '0');
				if (temp == 2) {
					if (s.charAt(i) == '1')
						res.append(0);
					else
						res.append(1);
				} else if (temp == 1) {
					if (s.charAt(i) == '1')
						res.append(1);
					else
						res.append(0);
				} else
					res.append(1);
			}
		}
		System.out.println(res);
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