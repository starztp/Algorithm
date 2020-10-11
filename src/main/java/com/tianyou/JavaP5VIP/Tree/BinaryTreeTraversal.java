package com.tianyou.JavaP5VIP.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的三种遍历方式
 */
public class BinaryTreeTraversal {

    /**
     * 给定一个二叉树，返回它的前序遍历。
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
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> tree=new ArrayList<>();
        if(root==null){
            return tree;
        }
        //返回左子树集合
        List<Integer> left=preorderTraversal(root.left);
        //返回右子树集合
        List<Integer> right=preorderTraversal(root.right);
        //添加根节点的值
        tree.add(root.val);
        //添加左子树集合
        tree.addAll(left);
        //添加右子树集合
        tree.addAll(right);
        return tree;
    }

    /**
     * 给定一个二叉树，返回它的中序遍历。
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
        List<Integer> tree=new ArrayList<>();
        if(root==null){
            return tree;
        }
        //返回左子树集合
        List<Integer> left=inorderTraversal(root.left);
        //返回右子树集合
        List<Integer> right=inorderTraversal(root.right);
        //添加左子树集合
        tree.addAll(left);
        //添加根节点的值
        tree.add(root.val);
        //添加右子树集合
        tree.addAll(right);
        return tree;
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
        List<Integer> tree=new ArrayList<>();
        if(root==null){
            return tree;
        }
        //返回左子树集合
        List<Integer> left=postorderTraversal(root.left);
        //返回右子树集合
        List<Integer> right=postorderTraversal(root.right);
        //添加左子树集合
        tree.addAll(left);
        //添加右子树集合
        tree.addAll(right);
        //添加根节点的值
        tree.add(root.val);
        return tree;
    }

}
