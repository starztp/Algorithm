package com.tianyou.JavaP5VIP.Tree.Review1;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeSerializeAndDeSerializeReview {

    /**
     * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
     *
     * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
     *
     * 示例: 
     *
     * 你可以将以下二叉树：
     *
     *     1
     *    / \
     *   2   3
     *      / \
     *     4   5
     *
     * 序列化为 "[1,2,3,null,null,4,5]"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        List<TreeNode> TreeNodeList=new ArrayList<>();
        if(root==null){
            return TreeNodeList.toString();
        }

        TreeNodeList.add(root);
        for(int i=0;i<TreeNodeList.size();i++){
            TreeNode treeNode=TreeNodeList.get(i);
            if(treeNode==null){
                continue;
            }
            TreeNode left=treeNode.left;
            TreeNode right=treeNode.right;
            TreeNodeList.add(left);
            TreeNodeList.add(right);
        }

        while (TreeNodeList.get(TreeNodeList.size()-1)==null){
            TreeNodeList.remove(TreeNodeList.size()-1);
        }

        StringBuffer buffer=new StringBuffer();
        buffer.append("[");
        buffer.append(TreeNodeList.get(0).val);
        for(int i=1;i<TreeNodeList.size();i++){
            TreeNode treeNode=TreeNodeList.get(i);
            if(treeNode==null){
                buffer.append(",#");
            }else {
                buffer.append(","+treeNode.val);
            }
        }
        buffer.append("]");
        return buffer.toString();
    }


    /**
     * 反序列化
     * 将字符串转为二叉树
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {
        if(data==null||data.isEmpty()||data.equals("[]")){
            return null;
        }

        data=data.substring(1,data.length()-1);
        String[] value=data.split(",");
        List<TreeNode> treeNodeList=new ArrayList<>();
        TreeNode root=new TreeNode(Integer.parseInt(value[0]));
        treeNodeList.add(root);
        int index=0;
        boolean isleft=true;
        for(int i=1;i<value.length;i++){
            if(!value[i].equals("#")){
                TreeNode treeNode=new TreeNode(Integer.parseInt(value[i]));
                if(isleft){
                    treeNodeList.get(index).left=treeNode;
                }else {
                    treeNodeList.get(index).right=treeNode;
                }
                treeNodeList.add(treeNode);
            }

            if(!isleft){
                index++;
            }
            isleft=!isleft;
        }
        return treeNodeList.get(0);
    }
}
