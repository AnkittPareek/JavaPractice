package com.company;
import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;

//class representing Structure of node in the binary tree
class treeNode {
    int data;
    tNode left;
    tNode right;

    public treeNode(int element) {
        data = element;
        left = null;
        right = null;
    }
}

//class used to print the left view of a binary tree
class LeftViewOfBinaryTree {
    static tNode rootNode;

    public static void main(String args[]) {
        //creating a binary tree
        LeftViewOfBinaryTree tree = new LeftViewOfBinaryTree();

        //root node of the binary tree
        tNode rootNode;

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<tNode> q = new LinkedList<tNode>();

        // creating a new binary tree.
        rootNode = new tNode(in.nextInt());
        q.add(rootNode);
        tNode cur = null;
        for (int i = 1; i < n; i++) {

            cur = q.remove();
            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.left = new tNode(element);
                q.add(cur.left);
            }
            i++;
            element = in.nextInt();
            //Note: if the element is -1 then the node is null
            if (element != -1) {
                cur.right = new tNode(element);
                q.add(cur.right);
            }
        }

        //write your code here
        preOrder(1,rootNode);
    }
    //PreOrder Traversal
    public static int maxLevel = 0;
    public static boolean preOrder(int level, tNode node){

        if (node!= null ) {
            if(maxLevel<level) {
                System.out.println(node.data);
                maxLevel = level;
            }
            preOrder(++level,node.left);
            --level;
            preOrder(++level,node.right);
            --level;
        }
        return true;
    }
}
