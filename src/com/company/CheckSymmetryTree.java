package com.company;
import java.util.*;

//class representing Structure of node in the binary tree
//class treeNode {
//    int data;
//    treeNode left, right;
//
//    treeNode(int value) {
//        data = value;
//        left = null;
//        right = null;
//    }
//}

public class CheckSymmetryTree {
    static treeNode rootNode;


    public static void main(String[] args) {

        CheckSymmetryTree binaryTree = new CheckSymmetryTree();

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary tree.
        binaryTree.rootNode = new treeNode(in.nextInt());
        q.add(binaryTree.rootNode);
        treeNode cur = null;
        for (int i = 1; i < n; i++) {

            cur = q.remove();

            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.left = new treeNode(element);
                q.add(cur.left);
            }
            i++;

            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.right = new treeNode(element);
                q.add(cur.right);
            }
        }
        //write your code here
        int[] arr  = new int[n];
        boolean isSymmetric = true;
        inorderArr(rootNode, arr);
        for (int i = 0, j= n-1; i<j  ; i++ , j--){
                if (arr[i]!= arr[j])
                    isSymmetric = false;
        }
        System.out.println(isSymmetric);
    }

    static int i = 0;
    public static int[] inorderArr(treeNode node, int[] arr) {
        if (node != null) {
            inorderArr(node.left,arr);
            arr[i++]=(node.data);
            inorderArr(node.right,arr);
        }
        return arr;
    }
}


