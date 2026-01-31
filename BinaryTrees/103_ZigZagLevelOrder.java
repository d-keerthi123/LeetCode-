//Time Complexity O(n) - Each node is visited exactly once
//Space Complexity O(n) - due to queue, result list and level list [O(n) +O(n)+O(n) = O(n) only since we ignore constants ]

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        
        if(root== null){
            return result;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        int level =1;
        while( !q.isEmpty()){
            int size=q.size();
            List<Integer> levelList=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();

                //condition check
                if(level % 2== 0){
                    levelList.add(0,curr.val); //add at front
                }
                else{
                    levelList.add(curr.val);
                }


                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                } 


            }
            result.add(levelList);
            level++;
        }
        return result;
    }
}
