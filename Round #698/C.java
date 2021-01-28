import java.util.*;
import java.io.*;
import java.math.*;

class C {

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

		long[] arr = new long[n];
		int index = 0;
		HashMap<Long, Integer> map1 = new HashMap<>();
		HashMap<Long, Integer> map2 = new HashMap<>();

		for (int i = 0; i < n; i++) {

			long temp = sc.nextLong();

			if (map1.containsKey(temp)) {
				map2.put(temp, i);
			} else {
				arr[index++] = temp;
				map1.put(temp, i);
			}
		}

		HashSet<Integer> set = new HashSet<>();

		for (long ele : arr) {

			int ind1 = map1.get(ele);
			int ind2 = map2.get(ele);

			int t = ind2 - ind1;

			if (set.contains())

			}

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