package com.company;
import java.util.*;

public class DetectDuplicateParentheses {
    public static class Node {
        private char data;
        private Node next;

        Node(char data) {
            super();
            this.data = data;
        }
        public char getData() {
            return data;
        }
        public void setData(char data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static class Stack {
        Node head;
        public Stack() {
            super();
            head = null;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void push(char data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
        public char pop() {
            if (head == null) {
                return '\0';
            }
            char data = head.getData();
            head = head.getNext();
            return data;
        }
        public char peek()
        {
            if (!isEmpty()) {
                return head.data;
            }
            else {
                System.out.println(" ");
                return '\0';
            }
        }
    }
    public static String findDuplicateParenthesis(String inputString) {
        //Write your code here
        String result = "absent";
        Stack s1 = new Stack();
        char box = 'a';
        for (int i = 0; i<inputString.length(); i++){
                s1.push(inputString.charAt(i));
        }
        while (!s1.isEmpty()){
            if(s1.peek()=='('||s1.peek()==')') {
                box = s1.pop();
                if (s1.peek()==box)
                    result= "present";
                else box='a';
            }
            else s1.pop();

        }
    return  result;
    }
    public static void main(String[] args){
        DetectDuplicateParentheses obj = new DetectDuplicateParentheses();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));
    }
}