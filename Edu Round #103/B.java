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
		int k = sc.nextInt();

		long[] arr = new long[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextLong();

		long[] prefix = new long[n];

		prefix[0] = arr[0];

		for (int i = 1; i < n; i++)
			prefix[i] = prefix[i - 1] + arr[i];


		long res = 0;


		for (int i = 1; i < n; i++) {

			long val = arr[i] * 100;
			if (((double)val / (double)(prefix[i - 1] + res)) <= k)
				continue;
			// System.out.println((prefix[i - 1] + res) * k);
			long curr = (prefix[i - 1] + res) * k;
			res += (val - curr) / k + (val - curr) % k;
		}

		sb.append(res + "\n");

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