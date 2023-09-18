/* bai4: Tuan Anh
 * Write a program to print Fibonacci series of n terms where n is input by user
 */
package bai4;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong so hang trong day fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("chuoi fibonacci gom " + n + " so hang la:");
        for (int i = 0; i < n; i++) {
            int so_fibonacci = tinh_fibonacci(i);
            System.out.print(so_fibonacci + " ");
        }
        scanner.close();
    }

    public static int tinh_fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return tinh_fibonacci(n - 1) + tinh_fibonacci(n - 2);
        }
    }
}
