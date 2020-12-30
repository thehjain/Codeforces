


import java.util.*;
import java.io.*;
import java.math.*;

public class B {

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
		String[] input = br.readLine().trim().split(" ");

		int index = 0;
		int[] arr = new int[n];
		for (String ele : input)
			arr[index++] = Integer.parseInt(ele);

		HashSet<Integer> set = new HashSet<>();

		for (int ele : arr) {
			if (!set.contains(ele))
				set.add(ele);
			else {
				if (!set.contains(ele + 1))
					set.add(ele + 1);
			}
		}
		System.out.println(set.size());
	}

}