class BinaryTree {
    Node_BST root;

    Node_BST insert(Node_BST root, int x) {
        if (root == null) {
            root = new Node_BST(x);
            return root;
        }

        if (x < root.val) root.left = insert(root.left, x);
        else if (x > root.val) root.right = insert(root.right, x);

        return root;
    }

    boolean search(Node_BST root, int x) {
        if (root == null || root.val == x) return root != null;
        if (root.val > x) return search(root.left, x);

        return search(root.right, x);
    }

    Node_BST delete(Node_BST root, int x) {
        if (root == null) return root;

        if (x < root.val) root.left = delete(root.left, x);
        else if (x > root.val) root.right = delete(root.right, x);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.val = findMin(root.right);

            root.right = delete(root.right, root.val);
        }
        return root;
    }

    int findMin(Node_BST root) {
        if (root.left != null) return findMin(root.left);
        return root.val;
    }

    int findMax(Node_BST root) {
        if (root.right != null) return findMax(root.right);
        return root.val;
    }

    void preorderTraversal(Node_BST root) {
        if (root == null) {
            return;
        }

        System.out.print(" " + root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    void inorderTraversal(Node_BST root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(" " + root.val);
        inorderTraversal(root.right);
    }

    void postorderTraversal(Node_BST root) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(" " + root.val);
    }
}
