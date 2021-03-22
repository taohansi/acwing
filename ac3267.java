import java.util.Scanner;

public class ac3267 {
    static int[] a = new int[4];
    public static void main(String args[]) {
        int r, y, g, n;
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        y = scanner.nextInt();
        g = scanner.nextInt(); 
        n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int s, t;
            s = scanner.nextInt();
            t = scanner.nextInt();
            if (s == 0) count += t;
            else if (s == 1) count += t;
            else if (s == 2) count += r + t;
            else if (s == 3) count += 0;
        }
        scanner.close();
        System.out.println(count);
    }

}
