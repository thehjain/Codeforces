import java.util.*;
import java.io.*;
import java.math.*;

class C {

	static class Pair {
		int a, b;
		Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

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

		int n = sc.nextInt() * 2;

		Pair[] pairs = new Pair[(n / 2) + 1];
		HashMap<Integer, Integer> map = new HashMap<>();

		int index = 1;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		boolean flag = true;

		int sum = arr[n - 1];

		for (int j = 0; j < n - 1; j++) {
			sum = arr[n - 1];
			map.clear();
			flag = true;
			index = 1;
			for (int ele : arr) {
				if (!map.containsKey(ele))
					map.put(ele, 0);
				map.put(ele, map.get(ele) + 1);
			}

			if (map.get(arr[n - 1]) == 1)
				map.remove(arr[n - 1]);
			else
				map.put(arr[n - 1], map.get(arr[n - 1]) - 1);

			pairs[0] = new Pair(arr[n - 1], arr[j]);

			// System.out.println(arr[n - 1] + " " + arr[j]);

			if (map.get(arr[j]) == 1)
				map.remove(arr[j]);
			else
				map.put(arr[j], map.get(arr[j]) - 1);

			// System.out.println(map.containsKey(arr[j]));

			for (int i = n - 2; i >= 0; i--) {
				// System.out.println(arr[i] + " ");
				if (!map.containsKey(arr[i])) continue;
				if (map.get(arr[i]) == 1)
					map.remove(arr[i]);
				else
					map.put(arr[i], map.get(arr[i]) - 1);
				if (map.containsKey(sum - arr[i])) {
					pairs[index++] = new Pair(arr[i], sum - arr[i]);

					// System.out.println()
					if (map.containsKey(sum - arr[i])) {
						if (map.get(sum - arr[i]) <= 1)
							map.remove(sum - arr[i]);
						else
							map.put(sum - arr[i], map.get(sum - arr[i]) - 1);
					}
					sum = arr[i];
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				sum = arr[n - 1] + arr[j];
				break;
			}
		}

		// for (int ele : arr) {
		// 	if (map.containsKey(ele)) {
		// 		sum = arr[n - 1] + ele;
		// 		pairs[0] = new Pair(arr[n - 1], ele);
		// 	}
		// }

		if (!flag) {
			System.out.println("NO");
		}

		else {
			System.out.println("YES");
			System.out.println(sum);
			for (Pair ele : pairs) {
				if (ele == null) break;
				System.out.println(ele.a + " " + ele.b);
			}
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