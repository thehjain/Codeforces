import java.util.*;
import java.io.*;
import java.math.*;

class C {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static FastScanner sc = new FastScanner();
	static int MAXN = 100010;
	static int[] arr = new int[MAXN];

	public static void main(String[] args) throws IOException {
		// int T = sc.nextInt();
		// while (T-- > 0) {
		solve();
		// }
	}

	static void query(int mid, int n) {
		if (1 <= mid && mid <= n) {
			System.out.println("? " + mid);
			System.out.flush();
			arr[mid] = sc.nextInt();
		}
	}

	static void solve() throws IOException {

		int n = sc.nextInt();

		arr[0] = arr[n + 1] = n + 1;

		int low = 1, high = n;

		while (low < high) {
			int mid = low + (high - low) / 2;
			query(mid, n);
			query(mid + 1, n);
			if (arr[mid] < arr[mid + 1])
				high = mid;
			else
				low = mid + 1;
		}

		System.out.println("! " + low);
		System.out.flush();

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