


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

		ArrayList<Integer> seq = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();

		int temp = n;

		while (temp > 2) {
			temp = (int)Math.sqrt(temp) + 1;
			seq.add(temp);
			set.add(temp);
		}

		System.out.println(n - 2  + seq.size());
		for (int i = 3; i < n; i++)
			if (!set.contains(i))
				System.out.println(i + " " + n);

		int prev = n;
		for (int ele : seq) {
			System.out.println(prev + " " + ele);
			System.out.println(prev + " " + ele);
			prev = ele;
		}

	}

}