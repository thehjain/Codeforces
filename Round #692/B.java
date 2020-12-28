


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

		long n = Long.parseLong(br.readLine());

		long temp = n;

		while (temp > 0) {
			if (temp % 10 != 0 && n % (temp % 10) != 0) {
				n++;
				temp = n;
				continue;
			}
			temp /= 10;
		}

		System.out.println(n);

		// while (true) {
		// 	if (allDigitsDivide(n)) {
		// 		System.out.println(n);
		// 	} else {
		// 		long res = getLcm(n);
		// 		n += (res - n % res);
		// 	}
		// }

		// // String s = br.readLine();
		// // char[] arr = s.toCharArray();
		// // int[] ar = new int[arr.length];
		// // int index = 0;
		// // for (char ele : arr)
		// // 	ar[index++] = (ele - '0');
		// // int res = 1;
		// // for (int ele : ar) {
		// // 	if(ele==0) continue;
		// // 	res = lcm(ele, res);
		// // }
		// // long number = Long.parseLong(s);
		// // long temp = number % res;
		// // temp = res - temp;
		// // number = number + temp;
		// // System.out.println(number);

	}

	static long getLcm(long n) {

		long res = 1;
		long temp = n;

		while (temp > 0) {

			long curr = temp % 10;
			if (curr == 0) {
				temp /= 10;
				continue;
			}

			res = lcm(res, curr);
			temp /= 10;
		}
		return res;
	}
	static boolean checkDivisibility(long n, long digit) {
		// If the digit divides the number
		// then return  true else return false.
		return (digit != 0 && n % digit == 0);
	}

	// Function to check if all
	// digits of n divide it or not,
	static boolean allDigitsDivide(long n) {
		long temp = n;
		while (temp > 0) {

			// Taking the digit of the
			// number into var 'digit'.
			long digit = temp % 10;

			if ((checkDivisibility(n, digit)) == false)
				return false;

			temp /= 10;
		}
		return true;
	}

	static long lcm(long a, long b) {
		return (a / gcd(a, b)) * b;
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

}