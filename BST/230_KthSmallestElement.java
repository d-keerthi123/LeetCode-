//Time Complexity O(n)
//Space Complexity O(n) (due to ArrayList O(n) + recursion stack O(h)

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        //get inorder seq and store it in arraylist
        ArrayList<Integer> sorted =new ArrayList<>();
        inorder(root,sorted);
        //get value of node at kth position
        //// k is 1-based, index is 0-based
        return sorted.get(k-1);
    }

    public static void inorder(TreeNode root,ArrayList<Integer> sorted){ //left-root-right
        if(root == null){
            return;
        }
        inorder(root.left,sorted);
        sorted.add(root.val);
        inorder(root.right,sorted);

    }
}
