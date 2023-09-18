/* bai1: Tuan Anh
 * Write a program to calculate the sum of first n natural number, n input from keyboard
*/
import java.util.Scanner;

public class bai1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("nhap vao so n: ");
    int n = scanner.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println("Tong cac so tu nhien dau tien cho den n la :" + sum);

    scanner.close();
  }

}