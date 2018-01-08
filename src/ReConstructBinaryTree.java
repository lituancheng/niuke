/**
 * 重建二叉树——004
 *
 * @description 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 前根序遍历：先遍历根结点，然后遍历左子树，最后遍历右子树。
 * 中根序遍历：先遍历左子树，然后遍历根结点，最后遍历右子树。
 * 后根序遍历：先遍历左子树，然后遍历右子树，最后遍历根节点。
 *
 * @author ltc
 * @create 2018-01-04 16:23
 **/
public class ReConstructBinaryTree {

    /**
     *
     * @param pre 前根序列
     * @param in  中根序列
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    public TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn) {
        if(startPre>endPre || startIn>endIn){   //开始位置大于结束位置，说明无对应子节点
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);    //前根序列的第一个元素即为根节点
        for(int i=startIn;i<=endIn;i++){
            if(in[i] == pre[startPre]){ //前根序列头元素存在于中跟序列中
                root.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
                root.right = reConstructBinaryTree(pre, startPre+i+1-startIn, endPre, in, i+1, endIn);
                break;
            }
        }
        return root;
    }
}


/**
 * 定义二叉树
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
