//  Replace this file with the Solution for Project Euler Problem #002
//  Project Euler Problem: #002
//  Repository Maintainer: https://www.github.com/theSwapnilSaste
//  File Creation Date   : 14th March 2020
//  Solution Author      : Swapnil Saste | https://www.github.com/theSwapnilSaste
//  Solution added on    : 15th March 2020
//  Problem Status       : COMPLETED WITHOUT ERROR
//  Space for Notes
//  .
//  .

public class Solution_002 {

	public static void main(final String[] args) {
        // long time = System.nanoTime();
        System.out.println(new Solution_002().run());
        // System.out.println( "time used = " + (System.nanoTime() - time));
    }

	public String run() {
		int sum = 0;
		for (int x = 0;; x++) {
			final int fib = fibonacci(x);
			if (fib > 4000000)
				break;
			if (fib % 2 == 0)
				sum += fib;
		}
		return Integer.toString(sum);
	}

	private static int fibonacci(final int n) {
		if (n < 0 || n > 46)
			throw new IllegalArgumentException();
		int a = 0;
		int b = 1;
		for (int i = 0; i < n; i++) {
			final int c = a + b;
			a = b;
			b = c;
		}
		return a;
	}
// OUTPUT: 
// 4613732
// Time used = 220,373 nanoseconds
}
