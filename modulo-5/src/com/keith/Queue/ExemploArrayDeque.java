package com.keith.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
    public static void main(String[] args) {
        inserindoNaFila();
        removendoDaFila();
        acessandoDaFila();
    }

    private static void inserindoNaFila() {
        System.out.println("**** INSERINDO NA FILA ****");
        Deque<String> d = new ArrayDeque<>();
        d.add("Vermelho");
        d.addFirst("Azul");
        d.add("Branco");
        d.addLast("Amarelo");
        d.add("Preto");
        System.out.println("Depois de inserir elementos: " + d);
        System.out.println();

        Deque<String> dq = new ArrayDeque<>();
        dq.add("Outro");
        d.addAll(dq);
        System.out.println("Depois de inserir todos elementos do {d}: " + d);
        System.out.println();
    }
    private static void removendoDaFila() {
        System.out.println("**** REMOVENDO DA FILA ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Vermelho");
        ad.add("Azul");
        ad.add("Branco");
        ad.add("Amarelo");
        ad.add("Preto");

        Deque<String> d = new ArrayDeque<>();
        d.add("Cinza");
        d.add("Marrom");
        d.add("Azul Marinho");
        d.add("Cinza Escuro");
        d.add("Verde");

        ad.addAll(d);
        System.out.println("Elementos do ArrayDeque: " + ad);
        System.out.println();

        ad.remove();
        ad.remove("Preto");
        System.out.println("Depois remover {Vermelho, Preto} : " + ad);
        System.out.println();

        ad.removeFirst();
        ad.removeLast();
        System.out.println("Depois removeFirst e removeLast : " + ad);
        System.out.println();

        ad.poll();
        ad.pollFirst();
        ad.pollLast();
        System.out.println("Depois de poll, pollFirst, pollLast: " + ad);
        System.out.println();

        ad.pop();
        System.out.println("Depois de pop: " + ad);
        System.out.println();

        ad.retainAll(d);
        System.out.println("Depois do retainAll: " + ad);
        System.out.println();

        ad.removeAll(d);
        System.out.println("Depois do removeAll: " + ad);
        System.out.println();
    }
    private static void acessandoDaFila() {
        System.out.println("**** ACESSANDO DA FILA ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Vermelho");
        ad.add("Azul");
        ad.add("Branco");
        ad.add("Amarelo");
        ad.add("Preto");

        Deque<String> d = new ArrayDeque<>();
        d.add("Verde");
        d.add("Laranja");

        ad.addAll(d);
        System.out.println();
        System.out.println(ad);
        System.out.println("{ad} contém: " + ad.contains("Branco"));
        System.out.println("{d} contém: " + d.contains("Castanho"));
        System.out.println("{d} contém todos elementos de {d}: " + d.containsAll(d));
        System.out.println();

        System.out.println("Saída do elemento: " + ad.element());
        System.out.println("Pegar o primeiro o elemento usando getFirst: " + ad.getFirst());
        System.out.println("Pegar o último elemento usando o getLast: " + ad.getLast());
        System.out.println("Saída de peek: " + ad.peek());
        System.out.println("Pegar o primeiro elemento usando peekFirst: " + ad.peekFirst());
        System.out.println("Pegar p último elemento usando o peekLast: " + ad.peekLast());
        System.out.println();
    }
}
