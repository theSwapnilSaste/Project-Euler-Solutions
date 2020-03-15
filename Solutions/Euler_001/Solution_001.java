//  Replace this file with the Solution for Project Euler Problem #001
//  Project Euler Problem: #001
//  Repository Maintainer: https://www.github.com/theSwapnilSaste
//  File Creation Date   : 14th March 2020
//  Solution Author      : Swapnil Saste | https://www.github.com/theSwapnilSaste
//  Solution added on    : 14th March 2020
//  Problem Status       : COMPLETED WITHOUT ERROR 
//  Space for Notes      : Sum of Arithmetic Progression is used to reduce Execution Time
//  .
//  .
public class Solution_001 {
	public static void main(String[] args) {
		// long time = System.nanoTime();
		int l = 3, j = 5, range = 999;
		System.out.println(SumPartial(l, range) + SumPartial(j, range) - SumPartial(15, range));
		// System.out.println( "time used = " + (System.nanoTime() - time));
	}
	public static int maxInRange(int numb, int rangeLimit) {
		int x = (Integer) (rangeLimit / numb);
		return x * numb;
	}
	public static int SumPartial(int i, int range) {
		int max = maxInRange(i, range);
		return (max * (i + max) / (2 * i));
	}
}
// OUTPUT:
// 233168 
// time used=207,917 nanoseconds