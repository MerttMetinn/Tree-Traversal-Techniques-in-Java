class BinaryTree{

    Node_BST insert(Node_BST root,int x)
    {
        if(root == null) return new Node_BST(x);

        if(x < root.val) root.left = insert(root.left,x);

        else root.right = insert(root.right,x);

        return root;
    }


    void postorder(Node_BST root){
        if(root == null)
        {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}