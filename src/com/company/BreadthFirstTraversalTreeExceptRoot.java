package com.company;
import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;

//class representing Structure of node in the binary tree
class tNode {
    int data;
    tNode left;
    tNode right;

    public tNode(int element) {
        data = element;
        left = null;
        right = null;
    }
}

//class used to print the left view of a binary tree
class BreadthFirstTraversalTree {
    static tNode rootNode;

    public static void main(String args[]) {
        //creating a binary tree
        BreadthFirstTraversalTree tree = new BreadthFirstTraversalTree();

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

        BFT(rootNode);
    }
    //PreOrder Traversal
    public static int maxLevel = 1;
    public static void BFT(tNode node){
        if(node!=null){
        if (node.left!= null )
                System.out.println(node.left.data);
        if (node.right!= null )
                System.out.println(node.right.data);
//                maxLevel ++;

            BFT(node.left);
//            --level;
            BFT(node.right);
//            --level;
        }
    }
}
