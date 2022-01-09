package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class representing Structure of node in a BST
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    treeNode(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class SumBinarySearchTree {

    treeNode rootNode;

    public static void main(String args[]) {
        SumBinarySearchTree BST = new SumBinarySearchTree();

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary search tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary search tree.
        BST.rootNode = new treeNode(in.nextInt());
        q.add(BST.rootNode);
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


        int targetSum;
        targetSum = in.nextInt();

        //if you find the elements whose sum is equal to the target sum then print true
        if (BST.CheckForSum(BST.rootNode, targetSum,n) != 0) {
            System.out.println("true");
        }

        // otherwise print false
        else {
            System.out.println("false");
        }
    }
    public static int i = 0;

    public static int[] inorderArr(treeNode node, int[] arr) {
        if (node != null) {
            inorderArr(node.left,arr);
            arr[i++]=(node.data);
            inorderArr(node.right,arr);
        }
        return arr;
    }

    public int CheckForSum(treeNode root, int targetSum, int n) {
        //write your code here
        int[ ] inOrderArr = new int[n];
        if (n==0)
            return 0;
        inorderArr(root,inOrderArr);
        if (n==1 && targetSum==inOrderArr[0])
            return 1;
        int sum = 0,first = 0, last = n-1;
        while (sum!=targetSum&&first!=last) {
            sum = inOrderArr[first] + inOrderArr[last];
            if (sum > targetSum)
                last--;
            else if (sum < targetSum)
                first++;
        }
        if (sum!=targetSum)
            return 0;
        return 1;
    }
}