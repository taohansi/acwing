import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int val;
    Node right, left;
}

public class ac1497 {
    static int n;
    static int[] postorder = new int[40];
    static int[] inorder = new int[40];
    static Map<Integer, Integer> pos = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
            pos.put(inorder[i], i);
        }
        Node root  = build(0, n - 1, 0, n - 1);
        bfs(root);
    }

    static Node build(int il, int ir, int pl, int pr) {
        // if (ir <= il || pr <= pl) return null; 可无需，因为当不满足条件时，不会递归下去
        Node root  = new Node();
        root.val = postorder[pr];
        int k = pos.get(root.val);
        // 特别注意区间
        if (il < k) root.left = build(il, k - 1, pl, k - 1 - il + pl);
        if (ir > k) root.right = build(k + 1, ir, k - 1 - il + pl + 1, pr - 1); // 注意在根节点之前结束
        return root;
    }

    static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

}
