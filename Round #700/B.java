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

		long heroAttack = sc.nextInt();
		long heroHealth = sc.nextInt();

		int n = sc.nextInt();

		long[] attack = new long[n];
		double[] health = new double[n];

		long max = MIN;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			attack[i] = sc.nextLong();
			max = Math.max(max, attack[i]);
		}
		for (int i = 0; i < n; i++)
			health[i] = sc.nextDouble();

		heroHealth += max;

		for (int i = 0; i < n; i++) {
			heroHealth -= (long)Math.ceil(health[i] / heroAttack) * attack[i];
			if (heroHealth < 0)
				break;
		}

		if (heroHealth > 0)
			sb.append("YES\n");
		else
			sb.append("NO\n");

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