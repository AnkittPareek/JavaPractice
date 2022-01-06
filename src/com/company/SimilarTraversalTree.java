package com.company;
import java.util.*;

class Nodu {
    int data;
    Nodu left;
    Nodu right;

    public Nodu(int element) {
        data = element;
        left = null;
        right = null;
    }
}
public class SimilarTraversalTree {
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
    public static void BFT(Nodu node, int[] arr){
        if(node!=null){
            if (node.left!= null )
                arr[i++] = node.left.data;
            if (node.right!= null )
                arr[i++] = node.right.data;
            BFT(node.left,arr);
            BFT(node.right,arr);
        }
    }
    public static int mostSimilar(int[] parent,int m){
        buildTree(parent);
        int[] inOrder = new int[m];
        int[] preOrder =new int[m];
        int[] postOrder =new int[m];
        preorderArr( rootNode,preOrder);
        i=0;
        postorderArr(rootNode,postOrder);
        i=0;
        inorderArr(rootNode,inOrder);
        int[] bFT = new int[m];
        i=1;
        if(rootNode!=null) {
            bFT[0] = rootNode.data;
            BFT(rootNode,bFT);
        }
        int sumIn =0, sumPre = 0,sumPost = 0;
        for (int z = 0 ; z<m ; z++){
            sumIn+= Math.abs(bFT[z]-inOrder[z]);
            sumPost+= Math.abs(bFT[z]-postOrder[z]);
            sumPre+= Math.abs(bFT[z]-preOrder[z]);
        }
        int min = 0;
        if(sumIn>sumPost)
            min = sumPost;
        else
            min = sumPre;
        if(min > sumIn)
            min = sumIn;
    return min;
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
        result = mostSimilar(parent,M+1);
        System.out.print(result);
        return ;
    }
}