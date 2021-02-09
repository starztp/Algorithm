package com.tianyou.OfferInterview.Alibaba.Interview.Day20210202;

import java.util.HashMap;
import java.util.Map;

public class Second {

    Map<Integer,Integer> indexMap=new HashMap<>();

    /**
     * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     *
     * 注意:
     * 你可以假设树中没有重复的元素。
     *
     * 例如，给出
     *
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     *
     * 返回如下的二叉树：
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            indexMap.put(inorder[i],i);
        }
        return MyBuildTree(preorder,inorder,0,preorder.length-1,0);
    }

    /**
     *
     * @param preorder          树的前序遍历
     * @param inorder           树的中序遍历
     * @param preorderleft      要计算的根节点
     * @param preorderright     要计算的根节点下左/右子树的极限位置
     * @param inorderleft       中序遍历左/右节点的初识位置
     * @return
     */
    private TreeNode MyBuildTree(int[] preorder, int[] inorder,int preorderleft,int preorderright,int inorderleft){
        //当左节点数量为空时，preorderleft+1>preorderleft+sublefttreesize
        //左节点超过右节点的位置就返回空
        if(preorderleft>preorderright){
            return null;
        }
        //定位根节点
        int rootval=preorder[preorderleft];
        TreeNode root=new TreeNode(rootval);
        int inorderrootIndex=indexMap.get(rootval);
        //获取左子树的节点数
        int sublefttreesize=inorderrootIndex-inorderleft;

        root.left=MyBuildTree(preorder,inorder,preorderleft+1,preorderleft+sublefttreesize,inorderleft);
        root.right=MyBuildTree(preorder,inorder,preorderleft+sublefttreesize+1,preorderright,inorderrootIndex+1);
        return root;
    }
}
