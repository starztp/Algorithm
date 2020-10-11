package com.tianyou.JavaP5VIP.Tree.Review1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideViewReview {

    /**
     * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
     *
     * 示例:
     *
     * 输入: [1,2,3,null,5,null,4]
     * 输出: [1, 3, 4]
     * 解释:
     *
     *    1            <---
     *  /   \
     * 2     3         <---
     *  \     \
     *   5     4       <---
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-right-side-view
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>  treeNodeValList=new ArrayList<>();
        if(root==null){
            return treeNodeValList;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);
        while (!queue.isEmpty()){
            treeNodeValList.add(queue.peek().val);
            int size=queue.size();
            for(int i=0;i<size;i++){
                //get(i)会导致数组越界
                //TreeNode treeNode=((LinkedList<TreeNode>) queue).get(i);
                TreeNode treeNode=((LinkedList<TreeNode>) queue).poll();
                TreeNode left=treeNode.left;
                TreeNode right=treeNode.right;

                if(right!=null){
                    queue.add(right);
                }
                if(left!=null){
                    queue.add(left);
                }
            }
        }

        return treeNodeValList;
    }
}
