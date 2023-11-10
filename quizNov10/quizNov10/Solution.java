package quizNov10;

import java.util.Scanner;

public class Solution{

	public static void main(String[] args) {
		String str;
		int[] digits;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("String: ");
		str = keyboard.nextLine();
		
		digits=getDigits(str);
		showDigits(digits);
	}
	
	public static void showDigits(int[] digits) {
		int index;
		
		System.out.print("[");
		for(index=0;index<digits.length;index++) {
			if(index!=0) System.out.print(",");
			System.out.print(digits[index]);
		}
		System.out.println("]");
	}

	public static int[] getDigits(String str) {
		//*** Provide the Code to Implement this function ***
		//*** Run Program to Test ***
		
		return null;
	}

}
