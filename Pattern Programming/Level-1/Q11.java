 
    import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Rows: ");
        int n = scanner.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n) {
        // Check if number of rows is odd
        if (n % 2 == 0) {
            System.out.println("Pattern is not possible for Even Row!");
            return;
        }

        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Conditions to print "*"
                if (
                    i == mid || j == mid || // Middle row or middle column
                    (i == 1 && j <= mid) ||     // Top-left horizontal
                    (j == 1 && i >= mid) ||     // Bottom-left vertical
                    (j == n && i <= mid) ||  // Top-right vertical
                    (i == n && j >= mid)     // Bottom-right horizontal
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

