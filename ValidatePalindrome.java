package Java_Basic_Programs;

import java.util.Scanner;
//Question: Given a string numerical or alphanumeric, uppercase or lowercase, verify if the string provided is palindrome or not
//Sample Input : Racecar
//Sample Output : Given string is a palindrome
public class ValidatePalindrome {

    public static boolean isPalindrome(String str){
        int left=0;
        int right = str.length() -1;
        while(left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter the string you want to validate for palindrome: ");
        String userInput=scannerObject.nextLine();
        String convertedInput = userInput.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (isPalindrome(convertedInput)){
            System.out.println("Given string is a palindrome");
        }
        else {
            System.out.println("Given string is not a palindrome");
        }
        scannerObject.close();
    }
}
