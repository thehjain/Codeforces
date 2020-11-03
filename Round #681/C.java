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

		String[] arr = br.readLine().trim().split(" ");
		String[] brr = br.readLine().trim().split(" ");

		int[] A = new int[n];
		int[] B = new int[n];
		int index = 0;

		for (String ele : arr)
			A[index++] = Integer.parseInt(ele);
		index = 0;
		for (String ele : brr)
			B[index++] = Integer.parseInt(ele);

		long res = findSum(A, B, n);
		System.out.println(res);

	}

	static long findSum(int[] arr, int[] brr, int n) {

		Pair[] res = new Pair[n];

		for (int i = 0; i < n; i++) {
			res[i] = new Pair(arr[i], brr[i]);
		}

		Arrays.sort(res, new MyComparator());

		long sum = 0;
		long ans = Long.MAX_VALUE;

		for (int i = n - 1; i >= 0; i--) {
			long curr = Math.max(res[i].a, sum);

			if (curr < ans)
				ans = curr;

			sum += res[i].b;

		}
		ans = Math.min(sum, ans);
		return ans;

	}
}


class Pair {
	int a, b;
	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class MyComparator implements Comparator<Pair> {
	public int compare(Pair A, Pair B) {
		return (A.a - B.a);
	}
}