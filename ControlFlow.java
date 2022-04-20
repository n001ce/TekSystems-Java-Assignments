/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author Kepler01635
 *
 */
import java.util.Scanner;
public class ControlFlow {
	private static Scanner input = new Scanner(System.in);
	public static Scanner getScanner() {
		return input;
	}
	

	static void lessThan(int x) {
		if(x < 10) {
			System.out.println("Less Than 10");
		}
	}
	
	static void lessGreat(int x) {
		if(x < 10) {
			System.out.println("Less Than 10");
		}else {
			System.out.println("Greater Than 10");
		}
	}
	
	static void ifElseIf(int x) {
		if(x < 10) {
			System.out.println("Less Than 10");
		}else if(x > 10 && x < 20){
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater Than Or Equal to 20");
		}
	}
	
	static void outOfRange(int x) {
		if(x < 10 || x > 20) {
			System.out.println("Out of range");
		}else {
			System.out.println("In range");
		}
	}
	
	static void grades() {
		Scanner in = getScanner();
		System.out.print("Enter a score between 0 - 100: ");
		int score = input.nextInt();
		char grade;
		if(score > 100 || score < 0) {
			System.out.print("Score out of Range! Reenter score: ");
			score = input.nextInt();
		}
		if(score >= 90 && score <= 100) {
			grade = 'A';
			System.out.println(grade);
		}else if(score < 90 && score >= 80) {
			grade = 'B';
			System.out.println(grade);
		}else if(score < 80 && score >=70) {
			grade = 'C';
			System.out.println(grade);
		}else if(score < 70 && score >= 60) {
			grade = 'D';
			System.out.println(grade);
		}else {
			grade = 'F';
			System.out.println(grade);
		}
	}
	
	static void weekDay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 7: ");
		int day = sc.nextInt();
		if(day > 7 || day < 0) {
			System.out.println("Number is out of range. Try Again: ");
			day = sc.nextInt();
		}
		sc.close();
		switch(day) {
			case 1: 
				System.out.println("Sunday");
				break;
			case 2: 
				System.out.println("Monday");
				break;
			case 3: 
				System.out.println("Tuesday");
				break;
			case 4: 
				System.out.println("Wednesday");
				break;
			case 5: 
				System.out.println("Thursday");
				break;
			case 6: 
				System.out.println("Friday");
				break;
			case 7: 
				System.out.println("Saturday");
				break;		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lessThan(7);
		lessThan(15);
		lessGreat(15);
		ifElseIf(15);
		ifElseIf(50);
		outOfRange(15);
		outOfRange(5);
		grades();
		weekDay();

	}

}
