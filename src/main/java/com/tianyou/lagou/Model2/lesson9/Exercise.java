package com.tianyou.lagou.Model2.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise {

    /**
     * 按层打印树
     * @param root
     * @return
     */
    public List<Integer> getTreeByStairs(TreeNode root){
        List<Integer> treeNodeValList=new ArrayList<>();
        if(root==null){
            return treeNodeValList;
        }
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        treeNodeQueue.add(root);
        for(int i=0;i<treeNodeQueue.size();i++){
            TreeNode treeNode=treeNodeQueue.poll();
            TreeNode left=treeNode.left;
            TreeNode right=treeNode.right;
            if(left!=null){
                ((LinkedList<TreeNode>) treeNodeQueue).add(left);
            }
            if(right!=null){
                ((LinkedList<TreeNode>) treeNodeQueue).add(right);
            }
        }
        for(TreeNode treeNode:treeNodeQueue){
            treeNodeValList.add(treeNode.val);
        }

        return treeNodeValList;
    }
}
