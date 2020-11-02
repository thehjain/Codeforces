


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
		String[] str = br.readLine().trim().split(" ");

		int[] arr = new int[n];
		int index = 0;

		for (String ele : str)
			arr[index++] = Integer.parseInt(ele);

		if (isPossible(arr, n))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	static boolean isPossible(int[] arr, int n) {

		ArrayList<Integer> res = new ArrayList<>();
		ArrayList<Integer> res1 = new ArrayList<>();

		for (int i = 1; i < n - 1; i++) {

			if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]))
				res.add(arr[i]);
			if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
				res1.add(arr[i]);
		}

		for (int i = 1; i < res.size() - 1; i++) {
			if ((res.get(i) >= res.get(i - 1) && res.get(i) >= res.get(i + 1)) ||
			        res.get(i) <= res.get(i - 1) && res.get(i) <= res.get(i + 1))
				return false;
		}
		for (int i = 1; i < res1.size() - 1; i++) {
			if ((res1.get(i) >= res1.get(i - 1) && res1.get(i) >= res1.get(i + 1)) ||
			        res1.get(i) <= res1.get(i - 1) && res1.get(i) <= res1.get(i + 1))
				return false;
		}

		return true;
	}

}