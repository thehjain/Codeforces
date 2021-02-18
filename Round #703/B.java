import java.util.*;
import java.io.*;
import java.math.*;

class B {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static FastScanner sc = new FastScanner();
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int T = sc.nextInt();
		while (T-- > 0) {
			solve();
		}
		System.out.print(sb);
	}

	static void solve() throws IOException {

		int n = sc.nextInt();

		long[] x = new long[n];
		long[] y = new long[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}

		long sum = 0;
		long res = Long.MAX_VALUE;
		int count = 0;

		for (int i = 0; i < n; i++) {
			sum = 0;
			long x_curr = x[i];
			long y_curr = y[i];
			for (int j = 0; j < n; j++) {
				if (i == j) continue;
				sum += distance(x_curr, y_curr, x[j], y[j]);
			}
			if (sum < res) {
				res = sum;
				count = 1;
			} else if (sum == res) {
				count++;
			}

		}

		sb.append(count + "\n");

	}

	static long distance(long x1, long y1, long x2, long y2) {
		return (Math.abs(x1 - x2) + Math.abs(y1 - y2));
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