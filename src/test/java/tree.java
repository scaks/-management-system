public class tree {

    /* Definition for a binary tree node. */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static class solution{
        public int maxDepth(TreeNode root){
            if(root == null){
                return 0;
            }else{
                int left_hight = maxDepth(root.left);
                int right_hight = maxDepth(root.right);
                return Math.max(left_hight,right_hight)+1;

            }
        }
    }
}
