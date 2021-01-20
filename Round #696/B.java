import java.util.*;
import java.io.*;
import java.math.*;

class B {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static int[] primes = new int[10001];
	static boolean[] prime = new boolean[1000001];
	static FastScanner sc = new FastScanner();
	static int index = 0;

	public static void main(String[] args) throws IOException {
		int T = sc.nextInt();
		fillPrime();
		while (T-- > 0) {
			solve();
		}
	}

	static void solve() throws IOException {

		int d = sc.nextInt();

		long sum = 1;
		int count = 0;
		int prev = 1;

		for (int ele : primes) {
			if (count == 2) break;
			if (ele - prev >= d) {
				sum *= ele;
				prev = ele;
				count++;
			}
			if (count == 2) break;
		}

		System.out.println(sum);

	}

	static void fillPrime() {
		int n = 1000000;
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				primes[index++] = i;
			if (index >= 10000) break;
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