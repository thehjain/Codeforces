import java.util.*;
import java.io.*;
import java.math.*;

public class B {

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

		int n = sc.nextInt();
		int x = sc.nextInt();

		long[] arr = new long[n];
		long[] val = new long[n];

		for (int i = 0; i < n; i++) {
			// arr[i] = sc.nextInt();
			// que.add(arr[i]);
			arr[i] = sc.nextLong();
			val[i] = arr[i];
		}

		long sum = 0;

		for (long ele : val)
			sum += ele;

		outer: while (true) {
			for (int i = 0; i < n; i++) {
				if (arr[i] % x == 0) {
					sum += val[i];
					arr[i] /= x;
				} else
					break outer;
			}
		}

		System.out.println(sum);
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