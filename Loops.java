/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author Kepler01635
 *
 */
public class Loops {

	static void loopNum() {
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(i);
		}
	}
	
	static void whileLoop() {
		int x = 0;
		while(x <= 100) {
			System.out.println(x);
			x+=10;
		}
		
	}
	
	static void doWhileNum() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
	}
	
	static void forLoop() {
		for(int i = 1; i <=100; i++) {	
			if(i % 5 != 0) {
				continue;
			}
			if(i >=25 && i <=75) {
				continue;
			}
			System.out.println(i);
			
		}
	}
	
	static void forLoopBreak() {
		for(int i = 1; i <= 100; i++) {
			if(i%5!= 0) {
				continue;
			}
			if(i > 50) {
				break;
			}
			System.out.println(i);
		}
	}
	
	static void nestedLoop() {
		for(int i = 1; i <= 2; i++) {
			System.out.println("Week " + i + ":");
			for(int j = 1; j<=5; j++) {
				System.out.println("Day " + j);
			}
		}
	}
	
	
	static void palindromes() {
		for(int i =10; i < 200; i++) {
			Integer num = new Integer(i);
			StringBuilder sb = new StringBuilder();
			sb.append(num);
			if(sb.reverse().toString().equals(num.toString())) {
				System.out.println(sb);
			}
		}
		}
	
	static void fibonacci() {
		int num1 = 0, num2 = 1, range = 50;
		int counter = 0;
		while(num1 < range) {
			System.out.print(num1 + " ");
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			counter += 1;
		}
		
	}
	
	static void innerFor() {
		for(int i = 0; i<10; i++) {
			for(int j =0; j<10; j++) {
				System.out.println("Inner loop: i: " + i + " j: " + j);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopNum();
		whileLoop();
		doWhileNum();
		forLoop();
		forLoopBreak();
		nestedLoop();
		palindromes();
		fibonacci();
		innerFor();
	}

}
