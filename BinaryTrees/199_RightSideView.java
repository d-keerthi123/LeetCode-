class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root ==null){
            return result;
        }
        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        q.add(null);
        TreeNode last = null;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr == null){
                // level ended → add rightmost node
                result.add(last.val);

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }
            else{
                last= curr;
                if(curr.left != null){
                    q.add(curr.left);
                    }
                if(curr.right != null){
                    q.add(curr.right);
                    }
            }
            
        }

        return result;

    }
}
