import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import org.w3c.dom.Node;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<n ; i++)
        {
            arr.add(sc.nextInt());
        }

        BinaryTree tree = new BinaryTree();
        Node_BST root = null;

        for(int i = 0; i<n ; i++)
        {
            root = tree.insert(root,arr.get(i));
        }

        tree.preorder(root);
    }
}

