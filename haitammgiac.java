/* cái này e thú nhận có sài chatGPT hehe, e chỉ hiều sơ sơ một phần thuii
 */
package tamgiac;

public class haitammgiac {
	 public static void main(String[] args) {
	        int solidTriangleRows = 9;
	        int hollowTriangleRows = 8;
	        int hollowTriangleColumns = 15;

	        System.out.println("Tam giác kín:");
	        printSolidTriangle(solidTriangleRows);

	        System.out.println("\nTam giác rỗng:");
	        printHollowTriangle(hollowTriangleRows, hollowTriangleColumns);
	    }

	    public static void printSolidTriangle(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    public static void printHollowTriangle(int rows, int columns) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                if (i == rows || k == 1 || k == 2 * i - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
