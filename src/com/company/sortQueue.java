package com.company;
import java.util.*;

public class sortQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }
    // Method to sort the queue

    public static int minIndex(Queue<Integer> list,
                               int sortIndex)
    {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();

            // This is dequeue() in Java STL
            list.poll();

            // we add the condition i <= sortIndex
            // because we don't want to traverse
            // on the sorted part of the queue,
            // which is the right part.
            if (current <= min_value && i <= sortIndex)
            {
                min_index = i;
                min_value = current;
            }
            list.add(current);
        }
        return min_index;
    }

    // Moves given minimum element
    // to rear of queue
    public static void insertMinToRear(Queue<Integer> list,
                                       int min_index)
    {
        int min_value = 0;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();
            list.poll();
            if (i != min_index)
                list.add(current);
            else
                min_value = current;
        }
        list.add(min_value);
    }
    static void sort(Queue<Integer> queue) {
        // Write your code here
        for(int i = 1; i <= queue.size(); i++)
        {
            int min_index = minIndex(queue,queue.size() - i);
            insertMinToRear(queue, min_index);
        }
        System.out.print(queue);
    }
}