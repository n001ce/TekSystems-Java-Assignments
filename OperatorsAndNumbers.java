/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author Kepler01635
 *
 */
public class OperatorsAndNumbers {
/*Question 1:
 * 1 = 0001
 * 8 = 1000
 * 33 = 0010 0001
 * 78 = 0100 1001
 * 787 = 0001 1000 1001
 * 33987 = 1000 0100 1100 0011
 */

/*Question 2:
 * 0010 = 2
 * 1001 = 9
 * 0011 0100 = 52
 * 0111 0010 = 242
 * 0010 0001 1111 = 543
 * 0010 1100 0110 0111 = 11365
 */
	
	static void leftShiftBinary(int x) {
		System.out.println("Binary: " + Integer.toBinaryString(x));
		x = x << 1;
		//For 2 it should be 0010 and decimal left shift 4
		System.out.println("Decimal: " + x);
	}
	
	static void rightShiftBinary(int x) {
		System.out.println("Binary: " + Integer.toBinaryString(x));
		x = x >> 2;
		System.out.println("Decimal: " + x);
	}
	
	static void xyz(int x, int y) {
		int z = (x&y);
		System.out.println("Binary: " + Integer.toBinaryString(z));
		System.out.println("Decimal: " + z);
		System.out.println("Binary: " + Integer.toBinaryString(x|y));
		System.out.println("Decimal: " + (x|y));
	}
	
	static void increment(int a) {
		System.out.println(a);
		a++;
		System.out.println(a);
	}
	
	static void loopIncrement(int a) {
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		a = a+1;
		System.out.println(a);
	}
	
	static void xy(int x, int y) {
		int sum = ++x + y;
		System.out.println(sum);
		sum = y+(x++);
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leftShiftBinary(2);
		leftShiftBinary(9);
		leftShiftBinary(17);
		leftShiftBinary(88);
		rightShiftBinary(150);
		rightShiftBinary(225);
		rightShiftBinary(1555);
		rightShiftBinary(32456);
		xyz(7, 17);
		increment(2);
		loopIncrement(10);
		xy(5,8);
	}

}
