/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author Kepler01635
 *
 */
public class JavaBasicsClass {

	static void addNums(int a, int b) {
		int sum = b+a;
		System.out.println(sum);
	}
	
	static void addDouble(double a, double b) {
		double sum = a+b;
		System.out.println(String.format("%.2f",sum));
	}
	static void addIntDouble(int a, double b) {
		int sum = (int) (a+b);
		System.out.println(sum);
	}
	static void divInt(int a, int b) {
		int sum;
		if(a > b) {
			sum = a/b;
		}else {
			sum = b/a;
		}
		System.out.println(sum);
	}
	
	static void divDouble(double a, double b) {
		double sum;
		if(a > b) {
			sum = a/b;
		}else {
			sum = b/a;
		}
		System.out.println(sum);
		sum = (int)sum;
		System.out.println(sum);
	}
	
	static void intXY() {
		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println(q);
		q = (double)y;
		System.out.println(q);
	}
	
	static void namedConstant(double x) {
		final double num = 49;
		System.out.println(x+num);
	}
	
	static void order() {
		final double SALES_TAX = .05;
		double coffee, greenTea, espresso;
		coffee = 3.89;
		greenTea = 2.59;
		espresso = 2.33;
		double subtotal, totalSale;
		subtotal = (3 * coffee) + (4 * greenTea) + (2 * espresso);
		totalSale = (subtotal * SALES_TAX) + subtotal;
		System.out.println(String.format("%.2f", totalSale));
	}
	
	public static void main(String[] args) {
		addNums(3,4);
		addDouble(2.8, 3.89);
		addIntDouble(10, 20.40);
		intXY();
		namedConstant(30);
		order();
	}

}
