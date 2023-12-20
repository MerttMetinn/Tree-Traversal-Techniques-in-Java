class BinaryTree
{
    Node_BST insert(Node_BST root, int x){
        if(root == null) return new Node_BST(x);

        if(x < root.val) root.left = insert(root.left,x);
        else root.right =  insert(root.right,x);
        return root;
    }


    void preorder(Node_BST root)
    {
        if(root == null){
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}