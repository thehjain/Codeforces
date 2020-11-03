
import java.util.*;
import java.io.*;
import java.math.*;

public class D {

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

		int[] arr = new int[n + 1];
		int index = 1;

		for (String ele : str)
			arr[index++] = Integer.parseInt(ele);

		if (isPossible(arr, n))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	static boolean isPossible(int[] arr, int n) {

		int[] diff = new int[n + 1];

		for (int i = 1; i <= n; i++)
			diff[i] = arr[i] - arr[i - 1];
		int max = diff[1];

		for (int i = 2; i <= n; i++)
			if (diff[i] < 0 && max + diff[i] >= 0) {
				max += diff[i];
				diff[i] = 0;
			}
		boolean flag = true;

		for (int i = 1; i <= n; i++)
			flag = (flag && diff[i] >= 0);

		return flag;
	}

}