/* bai2: Tuan annh
 * Write a program that prompts the user to input a positive integer.
 *  It should then print the multiplication table of that number. 
*/
package bai2;
import java.util.Scanner;
public class bai2 {

		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("nhap vao so nguyen duong n: ");
		        int n = scanner.nextInt();

		        for(int i = 1; i <= 10; i++){
		            int ketQua = n * i;
		            System.out.println("n" + "*" + i + "=" + ketQua);
		        }

		        scanner.close();
		    }

	}

