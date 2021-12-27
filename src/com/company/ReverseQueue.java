package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {
    static Queue<Integer> q = new LinkedList<Integer>();
    public static void func() {
        //write your code here
        Stack<Integer> s = new Stack<Integer>();
        if(q.isEmpty())
            return;
        else if (q.size()==1)
            return;
        else {
            while (!q.isEmpty()){
                s.push(q.remove());
            }
            while (!s.isEmpty())
                q.add(s.pop());
        }
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }
}

