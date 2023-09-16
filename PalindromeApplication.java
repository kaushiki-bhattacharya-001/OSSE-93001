import java.io.*;

public class PalindromeApplication {
  static boolean checkPalindrome(int num) {
    int temp = num, sum = 0;    
    while (num > 0) {    
      int r = num % 10;  
      sum = (sum * 10) + r;    
      num = num / 10;    
    }    
    if (temp == sum)    
      return true;    
    else    
      return false;  
  }
  
  public static void main(String args[]) {
    int num = 404;
    System.out.println("Check if the number is palindrome or not...");
    System.out.println(checkPalindrome(num));
  }
}
