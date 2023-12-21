class BinaryTree {
    Node_BST insert(Node_BST root, int x) {
        if (root == null) return new Node_BST(x);

        if (x < root.val) root.left = insert(root.left, x);
        else root.right = insert(root.right, x);
        return root;
    }

    int getHeight(Node_BST root) {
        if (root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
