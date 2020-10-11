package com.tianyou.JavaP5VIP.Tree.Review1;



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
        int leftval=maxPathSum(root.left);
        int rightval=maxPathSum(root.right);
        return Math.max(leftval+root.val,rightval+root.val);
    }
}
