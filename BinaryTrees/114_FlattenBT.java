//Time Complexity O(n)
 //Space Complexity O(n) -- recursion stack

class Solution {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        //flatten left and right subtrees
        flatten(root.left);
        flatten(root.right);
        //We save them because we are about to change pointers.
        TreeNode left=root.left;
        TreeNode right=root.right;

        root.left=null;
        root.right=left;

        TreeNode curr=root;
        while(curr.right !=null){
            curr=curr.right; //add left first
        }

        curr.right=right; //at the end add right
    }
}
