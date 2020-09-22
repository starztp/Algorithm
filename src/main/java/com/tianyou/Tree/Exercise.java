package com.tianyou.Tree;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    /**
     * 实际遇到过的面试题
     * 在一颗二叉树中获取其中所有奇数
     * @param root
     * @return
     */
    public List<Integer> getOddNumberInTreeNode(TreeNode root){
        List<Integer> oddnumberlist=new ArrayList<>();
        if(root==null){
            return oddnumberlist;
        }

        List<TreeNode> treeNodeList=new ArrayList<>();
        treeNodeList.add(root);

        for(int i=0;i<treeNodeList.size();i++){
            TreeNode treeNode=treeNodeList.get(i);
            if(treeNode==null){
                continue;
            }
            treeNodeList.add(treeNode.left);
            treeNodeList.add(treeNode.right);
        }

        while (treeNodeList.get(treeNodeList.size()-1)==null){
            treeNodeList.remove(treeNodeList.size()-1);
        }

        for(TreeNode treeNode:treeNodeList){
            if(treeNode.val%2!=0){
                continue;
            }
            oddnumberlist.add(treeNode.val);
        }
        return oddnumberlist;
    }
}
