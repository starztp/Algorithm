package com.tianyou.OfferInterview.Alibaba.Interview.Day20210202;

import org.junit.Test;

public class SecondTest {

    Second second=new Second();

    @Test
    public void TestbuildTree(){
        int[] preorder=new int[]{3,9,20,15,7};
        int[] inorder=new int[]{9,3,15,20,7};
        TreeNode treeNode=second.buildTree(preorder,inorder);
        System.out.println(treeNode);
    }
}
