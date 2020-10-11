package com.tianyou.JavaP5VIP.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

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
        List<Integer> TreerightSideList=new ArrayList<>();
        if(root==null){
            return TreerightSideList;
        }
        //定义楼层队列
        Queue<TreeNode> queue=new LinkedList<>();
        //先添加最上面的楼层（根节点）
        ((LinkedList<TreeNode>) queue).add(root);

        while (!queue.isEmpty()){
            //添加楼层最右侧的值
            TreerightSideList.add(queue.peek().val);
            //事先定义好当前楼层的size
            int size=queue.size();
            //for循环中在queue剔除当前楼层，从右往左添加下一楼层
            for(int i=0;i<size;i++){
                //剔除当前楼层
                TreeNode treeNode=queue.poll();
                TreeNode right=treeNode.right;
                TreeNode left=treeNode.left;
                //从右向左开始添加当前楼层
                if(right!=null){
                    ((LinkedList<TreeNode>) queue).add(right);
                }
                if(left!=null){
                    ((LinkedList<TreeNode>) queue).add(left);
                }
            }
        }
        return TreerightSideList;
    }
}
