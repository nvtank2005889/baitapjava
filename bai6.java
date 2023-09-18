/* bai6: Tuan Anh
 * Write a program to print out all Armstrong numbers between 1 and 500. 
 * If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
 */
package bai6;
import java.util.Scanner;
public class bai6 {

	public static void main(String[] args) {
		   for (int number = 1; number <= 500; number++) {
	            if (chinh_la_amstrong(number)) {
	                System.out.println(number);
	            }
	        }
	    }

	    public static boolean chinh_la_amstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, 3);
	            number /= 10;
	        }

	        return sum == originalNumber;

	}

}
