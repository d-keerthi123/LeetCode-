class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Both are null
        if(p == null && q == null){
            return true;
        }
        //one is null , other is not
        if(p == null || q == null){
            return false;
        }
        // values not equal
        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
