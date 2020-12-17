


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

		int[] arr = new int[n];
		int index = 0;
		for (String ele : input)
			arr[index++] = Integer.parseInt(ele);

		for (int i = 1; i < n; i++) {
			if (!(arr[i] % arr[i - 1] == 0 || arr[i - 1] % arr[i] == 0)) {
				if (arr[i] > arr[i - 1])
					arr[i] -= arr[i] % arr[i - 1];
				else
					arr[i] = 1;
			}
		}

		for (int ele : arr)
			System.out.print(ele + " ");
		System.out.println();

	}

}