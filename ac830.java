import java.util.Scanner;
import java.util.Stack;
public class ac830 {
    static int n;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++ ) {
            int x = sc.nextInt();

            while (!stack.isEmpty()) {
                if (stack.peek() >= x) stack.pop();
                else break;
            }
            int res = stack.isEmpty() ? -1 : stack.peek();
            stack.push(x);
            System.out.print(res + " ");
        }

    }
}
