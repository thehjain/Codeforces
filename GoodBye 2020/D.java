


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
		String[] input = br.readLine().trim().split(" ");

		HashMap<Integer, Integer> map = new HashMap<>();

		int[] arr = new int[n];
		int index = 0;
		for (String ele : input) {
			int curr = Integer.parseInt(ele);
			arr[index++] = curr;
			// if (map.containsKey(curr)) {
			// 	map.put(curr, map.get(curr) + 1);
			// } else
			map.put(curr, 0);
		}

		for (int i = 0; i < n - 1; i++) {
			String[] temp = br.readLine().trim().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);

			map.put(arr[a - 1], map.get(arr[a - 1]) + 1);
			map.put(arr[b - 1], map.get(arr[b - 1]) + 1);

		}

		Arrays.sort(arr);

		long sum = 0;
		for (int ele : arr)
			sum += ele;

		System.out.print(sum + " ");

		for (int i = 0; i < n - 2; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (map.get(arr[j]) > 1) {
					sum += arr[j];
					System.out.print(sum + " ");
					map.put(arr[j], map.get(arr[j]) - 1);
					break;
				}
			}
		}
		System.out.println();
	}

}