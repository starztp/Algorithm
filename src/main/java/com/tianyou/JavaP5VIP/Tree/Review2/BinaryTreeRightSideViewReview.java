package com.tianyou.JavaP5VIP.Tree.Review2;

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
        List<Integer> treevallist=new ArrayList<>();
        if(root==null){
            return treevallist;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);
        while (!queue.isEmpty()){
            int size=queue.size();

            treevallist.add(queue.peek().val);
            for(int i=0;i<size;i++){
                TreeNode treeNode=((LinkedList<TreeNode>) queue).poll();
                TreeNode left=treeNode.left;
                TreeNode right=treeNode.right;
                if(right!=null){
                    ((LinkedList<TreeNode>) queue).add(right);
                }
                if(left!=null){
                    ((LinkedList<TreeNode>) queue).add(left);
                }
            }
        }
        return treevallist;
    }
}
