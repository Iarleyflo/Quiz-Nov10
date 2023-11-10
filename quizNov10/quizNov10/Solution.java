package quizNov10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String str;
        int[] digits;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("String: ");
        str = keyboard.nextLine();

        digits = getDigits(str);
        showDigits(digits);
    }

    public static void showDigits(int[] digits) {
        int index;

        System.out.print("[");
        for (index = 0; index < digits.length; index++) {
            if (index != 0) System.out.print(",");
            System.out.print(digits[index]);
        }
        System.out.println("]");
    }

    public static int[] getDigits(String str) {
    	//*** Provide the Code to Implement this function ***
    			//*** Run Program to Test ***
        int[] result = new int[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                result[count++] = Character.getNumericValue(ch);
            }
        }

        int[] finalResult = new int[count];
        System.arraycopy(result, 0, finalResult, 0, count);

        return finalResult;
    }
}
