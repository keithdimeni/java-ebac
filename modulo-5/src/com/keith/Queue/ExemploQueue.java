package com.keith.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        //Ordenação natural
        Queue<String> queue = new PriorityQueue<>();
        queue.add("surto");
        queue.add("auito longo");
        queue.add("bédio");

        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
        System.out.println(queue.size());
    }
}
