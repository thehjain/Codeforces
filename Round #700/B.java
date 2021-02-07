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
		long[] health = new long[n];

		for (int i = 0; i < n; i++)
			attack[i] = sc.nextLong();
		for (int i = 0; i < n; i++)
			health[i] = sc.nextLong();

		boolean flag = true;

		for (int i = 0; i < n; i++) {
			if (heroHealth < 1 && health[i] >= 1) {
				flag = false;
				break;
			}
			long temp = health[i] / heroAttack;
			heroHealth -= attack[i] * temp;
			health[i] -= heroAttack * temp;
		}

		if (flag)
			for (int i = 0; i < n; i++) {

				if (health[i] == 0) continue;

				if (health[i] > 0 && heroHealth < 1) {
					flag = false;
					break;
				}

				heroHealth -= attack[i];
			}

		if (flag)
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