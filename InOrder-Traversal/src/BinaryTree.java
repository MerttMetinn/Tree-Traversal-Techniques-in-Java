class BinaryTree{

    Node_BST insert(Node_BST root ,int x)
    {
        if(root == null) return new Node_BST(x);

        if(x < root.val) root.left = insert(root.left,x);

        else root.right = insert(root.right,x);

        return root;
    }

    void inOrder(Node_BST root)
    {
        if(root == null)
        {
            return;
        }
        //LEFT - ROOT - RIGHT
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}