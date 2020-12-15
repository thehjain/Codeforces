


import java.util.*;
import java.io.*;
import java.math.*;

public class C {

	private static int MAX = Integer.MAX_VALUE;
	private static int MIN = Integer.MIN_VALUE;
	private static int MOD = 1000000007;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			solve();
		}
	}

	static void solve() throws IOException {

		int n = Integer.parseInt(br.readLine());

		if (n > 45) {
			System.out.println(-1);
			return;
		} else if (n <= 9) {
			System.out.println(n);
			return;
		} else {
			ArrayList<Integer> arr = new ArrayList<>();
			for (int i = 1; i <= 9; i++)
				arr.add(i);
			String s = "";
			while (n != 0) {
				if (n < arr.get(arr.size() - 1)) {
					s += n;
					break;
				}
				n -= arr.get(arr.size() - 1);
				s += Integer.toString(arr.get(arr.size() - 1));
				arr.remove(arr.size() - 1);
			}
			StringBuilder str = new StringBuilder(s);
			str.reverse();
			System.out.println(str.toString());
		}
	}

}