package com.tianyou.Tree;

public class BinaryTreeMathPathSum {

    /**
     * 求二叉树最长路径和
     * @param root
     * @return
     */
    public int maxPathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        //找出左子树值最大的那条路径的值
        int left=maxPathSum(root.left);
        //找出右子树值最大的那条路径的值
        int right=maxPathSum(root.right);
        //对比左右子树，找出最大路径，加上根节点的值就是我们要求的和
        return Math.max(0,Math.max(left,right))+root.val;
    }
}
