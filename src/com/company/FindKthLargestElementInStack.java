package com.company;
import java.util.*;

public class FindKthLargestElementInStack {

    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        //write your code here
        int box = 0;
        Stack < Integer > temp = new Stack< Integer >();
        temp.push(input.pop());
        while (!input.isEmpty()) {
            if (input.peek() <= temp.peek())
                temp.push(input.pop());
            else {
                box = input.pop();
                while (!temp.isEmpty()) {
                    input.push(temp.pop());
                }
                    temp.push(box);
            }
        }
        while (!temp.isEmpty()) {
            input.push(temp.pop());
        }
        return input;
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        //write your code here
        int element = sortedStack.peek();
        while (k!=0){
            element = sortedStack.pop();
            k--;
        }
        System.out.println(element);
        System.out.println("\n\n"+sortedStack.size());
    }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add(in.nextInt());
        }
        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }
        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }
        // This is the temporary stack
        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);
    }
}