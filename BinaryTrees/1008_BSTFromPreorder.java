class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        // for (int i = 0; i < preorder.length; i++) {
        //     int val = preorder[i];
        //     root = helper(root, val);
        // }

        for(int val:preorder){
            root=helper(root,val);
        }
        return root;
    }
    public TreeNode helper(TreeNode root,int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(root.val > val ){
            root.left=helper(root.left,val);
        }
        else{
            root.right=helper(root.right,val);
        }

        return root;
    }
}
