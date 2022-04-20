/**
 * 
 */
package com.perscholas.java_basics;

import java.util.Arrays;

/**
 * @author Kepler01635
 *
 */
public class ArrayExercises {

	/**
	 * @param args
	 */
	
	static void intArray() {
		int [] newArray = new int [3];
		for(int i = 0; i < 3; i++) {
			newArray[i] = i+1;
			System.out.println("Index: " + i + " value: " + newArray[i]);
		}
	}
	
	static void middleArray() {
		int [] newArray = {13,5,7,68,2};
		System.out.println(newArray[newArray.length/2]);
	}
	
	static void stringArray() {
		String [] newArray = {"red", "green", "blue", "yellow"};
		System.out.println(newArray.length);
		String [] copy = newArray.clone();
		System.out.println(Arrays.toString(copy).replace("[", "").replace("]", ""));
	}
	
	static void intElementsArray() {
		int [] newArray = new int [5];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = (int) (Math.random() * 100)+1;
		}
		System.out.println("First number: " + newArray[0] + "\rLast number: " + newArray[newArray.length-1]);
	}
	
	static void assignLoop() {
		int [] newArray = new int [5];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		System.out.println(Arrays.toString(newArray).replace("[", "").replace("]", ""));
	}
	
	static void multipleOfTwo() {
		int [] newArray = new int[5];
		for(int i = 0; i<newArray.length; i++) {
			newArray[i] = i * 2;
		}
		System.out.println(Arrays.toString(newArray).replace("[", "").replace("]", ""));
	}
	
	static void skipMiddle() {
		int [] newArray = new int[5];
		for(int i = 0; i < newArray.length; i ++) {
			newArray[i] = (int) (Math.random() * 100)+1;
		}
		System.out.println(Arrays.toString(newArray).replace("[", "").replace("]", ""));
		for(int i = 0; i < newArray.length; i ++) {
			if(i == 2) {
				continue;
			}
			System.out.println(newArray[i] + " ");
		}
	}
	
	static void stringArraySwap() {
		String newArray [] = {"random", "five", "words", "in" ,"array"};
		System.out.println(Arrays.toString(newArray).replace("[", "").replace("]", ""));
		String firstElement = newArray[0];
		newArray[0] = newArray[newArray.length-1];
		newArray[newArray.length-1] = firstElement;
		System.out.println(Arrays.toString(newArray).replace("[", "").replace("]", ""));
	}
	static void sortArray() {
		int [] newArray = {4,2,9,13,1,0};
		Arrays.sort(newArray);
		System.out.println("Sorted Array: " + Arrays.toString(newArray).replace("[", "").replace("]", ""));
		System.out.println("The smallest number is " + newArray[0] + "\rThe largest number is: " + newArray[newArray.length-1]);
	}
	
	static void intStringDouble() {
		Object [] newArray = {1,"This is a string", "for the random", "exercise", 2.98};
		System.out.println(Arrays.toString(newArray).replace("[", "").replace("]", ""));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intArray();
		middleArray();
		stringArray();
		intElementsArray();
		assignLoop();
		multipleOfTwo();
		skipMiddle();
		stringArraySwap();
		sortArray();
		intStringDouble();
	}

}
