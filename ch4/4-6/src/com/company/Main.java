package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MaintainQueue mq = new MaintainQueue();
        mq.processCustomers();

        Queue<String> customers = new LinkedList<>();

        customers.offer("Belhanda");
        customers.offer("Mousa");
        customers.offer("Sow");
        customers.offer("Hagi");
        customers.offer("Alex");
        customers.offer("Neymar");

        customers = displayQueue(customers);

        System.out.println(customers);

        Stack<String> s = new Stack<String>();
        s.push("Belhanda");
        s.push("Mousa");
        s.push("Hagi");
        s.push("Alex");
        s.push("Neymar");

        Queue<String> q = new LinkedList<>();


        String item = "";
        while (!s.empty()) {
            item = s.pop();
            q.offer(item);
        }
    }

    public static <E> Queue<E> displayQueue(Queue<E> queue){
        Queue<E> newQueue = new LinkedList<>();

        E obj = queue.poll();
        while (obj!=null){
            newQueue.offer(obj);
            System.out.println(obj);
            obj = queue.poll();
        }
        System.out.println("newQueue:" + newQueue);
        return newQueue;
    }
}
