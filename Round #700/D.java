import java.util.*;
import java.io.*;
import java.math.*;

class D {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static FastScanner sc = new FastScanner();

	public static void main(String[] args) throws IOException {
		// int T = sc.nextInt();
		// while (T-- > 0) {
		solve();
		// }
	}

	static void solve() throws IOException {

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int lastElement = -1;
		int lastSecond = -1;

		int res = n;

		for (int i = 0; i < n; i++) {

			// System.out.println("W" + lastElement + " " + "B" + lastSecond);

			if (arr[i] != lastSecond && arr[i] != lastElement) {
				if (i < n - 1 && arr[i + 1] != lastElement)
					lastSecond = arr[i];
				else
					lastElement = arr[i];
			} else if (arr[i] == lastSecond && arr[i] != lastElement)
				lastElement = arr[i];
			else if (arr[i] == lastElement && arr[i] != lastSecond)
				lastSecond = arr[i];
			else
				res--;
		}

		System.out.print(res);

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