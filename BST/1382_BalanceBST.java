//Time Complexity O(n)
class Solution {
    public void inorder(TreeNode root,ArrayList<Integer> sorted){ // Left-Root-Right
        if(root == null){
            return;
        }
        inorder(root.left,sorted);
        sorted.add(root.val);
        inorder(root.right,sorted);

    }

    public TreeNode balanceBST(TreeNode root) {
        //inorder seq -O(n)
        ArrayList<Integer> sorted= new ArrayList<>();
        inorder(root,sorted);

        //sorted ArrayList -> Balanced BST O(n)
        return convertBST(sorted,0,sorted.size()-1);
    }
    public TreeNode convertBST(ArrayList<Integer> sorted,int start,int end ){
        //base case
        if(start > end){
            return null;
        }
        //Find mid
        int mid=(start+end)/2;
        TreeNode root= new TreeNode(sorted.get(mid)); // mid is the root node

        root.left=convertBST(sorted,start,mid-1);
        root.right=convertBST(sorted,mid+1,end);

        return root;
    }
}
