package com.tianyou.JavaP5VIP.Tree.Review1;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreeTraversalReview {

    /**
     * 给定一个二叉树，返回它的 前序 遍历。
     *
     *  示例:
     *
     * 输入: [1,null,2,3]
     *    1
     *     \
     *      2
     *     /
     *    3
     *
     * 输出: [1,2,3]
     * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> Tree=new ArrayList<>();
        if(root==null){
            return Tree;
        }
        List<Integer> TreeLeft=preorderTraversal(root.left);
        List<Integer> TreeRight=preorderTraversal(root.right);
        Tree.add(root.val);
        Tree.addAll(TreeLeft);
        Tree.addAll(TreeRight);
        return Tree;
    }


    /**
     * 给定一个二叉树，返回它的中序 遍历。
     *
     * 示例:
     *
     * 输入: [1,null,2,3]
     *    1
     *     \
     *      2
     *     /
     *    3
     *
     * 输出: [1,3,2]
     * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> Tree=new ArrayList<>();
        if(root==null){
            return Tree;
        }
        List<Integer> TreeLeft=inorderTraversal(root.left);
        List<Integer> TreeRight=inorderTraversal(root.right);
        Tree.addAll(TreeLeft);
        Tree.add(root.val);
        Tree.addAll(TreeRight);
        return Tree;
    }

    /**
     * 给定一个二叉树，返回它的 后序 遍历。
     *
     * 示例:
     *
     * 输入: [1,null,2,3]
     *    1
     *     \
     *      2
     *     /
     *    3
     *
     * 输出: [3,2,1]
     * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> Tree=new ArrayList<>();
        if(root==null){
            return Tree;
        }
        List<Integer> TreeLeft=postorderTraversal(root.left);
        List<Integer> TreeRight=postorderTraversal(root.right);
        Tree.addAll(TreeLeft);
        Tree.addAll(TreeRight);
        Tree.add(root.val);
        return Tree;

    }
}
