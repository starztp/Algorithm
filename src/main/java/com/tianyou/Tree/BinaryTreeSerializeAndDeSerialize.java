package com.tianyou.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树树的序列化与反序列化
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
 */
public class BinaryTreeSerializeAndDeSerialize{

    // Encodes a tree to a single string.

    /**
     *将二叉树序列化为字符串集合
     * @param root
     * @return
     */
    public List<String> serializeToList(TreeNode root) {
        List<String> serializeList=new ArrayList<>();
        serializeList.add(String.valueOf(root.val));
        if(root!=null){
            int leftval=root.left.val;
            int rightval=root.right.val;
            if(root.left==null){
                serializeList.add(null);
            }else {
                serializeList.add(String.valueOf(leftval));
            }

            if(root.right==null){
                serializeList.add(null);
            }else {
                serializeList.add(String.valueOf(rightval));
            }
            List<String> left=serializeToList(root.left);
            List<String> right=serializeToList(root.right);
            serializeList.addAll(left);
            serializeList.addAll(right);
        }
        return serializeList;
    }

    /**
     * 将二叉树序列化为字符串
     * @param root
     * @return
     */
    public String serialize(TreeNode root){
        if(root==null){
            return null;
        }
        List<TreeNode> treeNodeList=new ArrayList<>();
        treeNodeList.add(root);
        for(int i=0;i<treeNodeList.size();i++){
            if(treeNodeList.get(i)==null){
                continue;
            }

            TreeNode left=treeNodeList.get(i).left;
            TreeNode right=treeNodeList.get(i).right;
            treeNodeList.add(left);
            treeNodeList.add(right);
        }
        while (treeNodeList.get(treeNodeList.size() - 1) == null) {
            treeNodeList.remove(treeNodeList.size() - 1);
        }

        StringBuilder stringBuilder=new StringBuilder("[");
        stringBuilder.append(treeNodeList.get(0).val);

        for(int i=1;i<treeNodeList.size();i++){
            if (treeNodeList.get(i) == null) {
                stringBuilder.append(",#");
            } else {
                stringBuilder.append("," + treeNodeList.get(i).val);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.

    /**
     * 将字符串反序列化为二叉树
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {
        if(data==null||data.equals("[]")){
            return null;
        }

        //去掉字符串首尾的[]
        String value=data.substring(1,data.length()-1);
        //解析data为数组
        String[] string=value.split(",");
        //定义根节点
        TreeNode root=new TreeNode(Integer.parseInt(string[0]));
        List<TreeNode> treeNodeList=new ArrayList<>();
        //添加二叉树根节点到treeNodeList
        treeNodeList.add(root);
        boolean isLeft=true;
        int Index=0;

        //分别添加二叉树左右子树到treeNodeList
        for(int i=1;i<string.length;i++){
            if(!string[i].equals("#")){
                TreeNode treeNode=new TreeNode(Integer.parseInt(string[i].trim()));
                if(isLeft){
                    //给上个节点的左子树赋值
                    treeNodeList.get(Index).left=treeNode;
                }else {
                    //给上个节点的右子树赋值
                    treeNodeList.get(Index).right=treeNode;
                }
                treeNodeList.add(treeNode);
            }
            //因为要等左右子树都赋值完再取下一个，所以要判断!isLeft
            if(!isLeft){
                Index++;
            }
            isLeft=!isLeft;
        }
        return treeNodeList.get(0);
    }
}
