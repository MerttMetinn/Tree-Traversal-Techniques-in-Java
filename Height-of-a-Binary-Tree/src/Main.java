import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        BinaryTree tree = new BinaryTree();
        Node_BST root = null;

        for (int i = 0; i < n; i++) {
            root = tree.insert(root, arr.get(i));
        }
        int height = tree.getHeight(root);
        System.out.println(height-1);
    }
}

