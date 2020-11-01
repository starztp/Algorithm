package com.tianyou.JavaP5VIP.Tree.Review2;



public class BinaryTreeMathPathSumReview {

    /**
     * 求二叉树最长路径和
     * @param root
     * @return
     */
    public int maxPathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxPathSum(root.left)+root.val;
        int right=maxPathSum(root.right)+root.val;
        return Math.max(left,right);
    }
}
