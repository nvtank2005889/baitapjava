/* bai 3: Tuan Anh
 * Write a program to find the factorial value of any number entered through the keyboard. 
 */
package bai3;
import java.util.Scanner;
public class bai3 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương nhee: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("Giai thừa của " + number + " là: " + factorial);

        scanner.close();
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}