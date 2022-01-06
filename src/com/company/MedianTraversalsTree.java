package com.company;
import java.util.*;

class Noda {
    int data;
    Nodu left;
    Nodu right;

    public Noda(int element) {
        data = element;
        left = null;
        right = null;
    }
}

public class MedianTraversalsTree {
    public static Nodu rootNode = new Nodu(0);
    public static Nodu returnNode = rootNode;
    public static int i = 0;

    public static Nodu findParent(Nodu n, int x){
        if (n != null) {
            if (n.data== x)
                returnNode = n;
            returnNode = findParent(n.left,x);
            returnNode = findParent(n.right,x);
        }
        return returnNode;
    }

    public static void buildTree(int[] parent){
        for (int i = 1; i<= parent.length; i++){
            Nodu temp = new Nodu(i);
            Nodu tempParent = findParent(rootNode,parent[i-1]);
            if(tempParent.left == null)
                tempParent.left=temp;
            else
                tempParent.right=temp;
        }
    }
    public static int[] inorderArr(Nodu node, int[] arr) {
        if (node != null) {
            inorderArr(node.left,arr);
            arr[i++]=(node.data);
            inorderArr(node.right,arr);
        }
        return arr;
    }
    public static int[] preorderArr(Nodu node, int[] arr) {
        if (node != null) {
            arr[i++]=(node.data);
            preorderArr(node.left,arr);
            preorderArr(node.right,arr);
        }
        return arr;
    }
    public static int[] postorderArr(Nodu node, int[] arr) {
        if (node != null) {
            postorderArr(node.left,arr);
            postorderArr(node.right,arr);
            arr[i++]=(node.data);
        }
        return arr;
    }
    public static int calculateMedian(int[] parent, int m){
        buildTree(parent);
        int[] inOrder = new int[m];
        int[] preOrder =new int[m];
        int[] postOrder =new int[m];
        preorderArr( rootNode,preOrder);
        i=0;
        postorderArr(rootNode,postOrder);
        i=0;
        inorderArr(rootNode,inOrder);
        int [] median = new int[m];
        int medianSum = 0;
        for (int i =0 ; i<m; i++){
            if ((inOrder[i]<=preOrder[i] && preOrder[i]<=postOrder[i]) || (postOrder[i]<=preOrder[i] && preOrder[i]<=inOrder[i]))
                median[i] = preOrder[i];
            else if ((preOrder[i]<=inOrder[i] && inOrder[i]<=postOrder[i])||(postOrder[i]<=inOrder[i] && inOrder[i]<=preOrder[i]))
                median[i] = inOrder[i];
            else if ((preOrder[i]<=postOrder[i] && postOrder[i]<=inOrder[i])||(inOrder[i]<=postOrder[i] && postOrder[i]<=preOrder[i]))
                median[i] = postOrder[i];
            medianSum= medianSum + median[i];
        }
        return medianSum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M;
        M=scan.nextInt();
        int[] parent = new int[M];
        for(int j=0;j<M;j++){
            parent[j]=scan.nextInt();
        }
        int result;
        result = calculateMedian(parent, M+1);
        System.out.print(result);
        return ;
    }
}