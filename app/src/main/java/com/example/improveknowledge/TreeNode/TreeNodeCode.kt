package com.example.improveknowledge.TreeNode

class TreeNodeCode {

    class TreeNode {
        var index: Int
        var data: String
        var leftChild: TreeNode?
        var rightChild: TreeNode?

        constructor(index: Int, data: String) {
            this.index = index
            this.data = data
            leftChild = null;
            rightChild = null;
        }
    }

    /**
     * 获取二叉树的高度
     *
     * 利用递归的思想 将左右两边的叉树递归到最底部 求左右两边的最大值 + 1
     */
    fun getHeight(): Int {
        var rootNode = TreeNode(0, "sda")
        return getHeight(rootNode)
    }

    fun getHeight(node: TreeNode?): Int {
        if (node == null) {
            return 1
        } else {
            return Math.max(getHeight(node.leftChild), getHeight(node.rightChild)) + 1;
        }
    }


}