package com.keith.array;

public class ExemploArray {
    public static void main(String[] args) {
        declaracaoArray();
        tamanhoArray();
        percorrendoArray1();
        percorrendoArray2();
        arrayBidimensional();
    }

    public static void declaracaoArray(){
        System.out.println("**** Declaração do Array");

        //[] - são inseridos em uma variavel que referencia um array
        int[] a = new int[4];

        //Outra maneira de fazer uma declaração de array
        int[] b;
        b = new int[10];

        //Declarando varios arrays
        int[] r = new int[44], k = new int[23];

        //{} - inicializar valores em um array sua declaração
        int[] iniaciaValores = {12,32,54,6,8,89,64,64,6};

        //declara u m array de inteiros
        int[] meuArray;

        //aloca memória para 10 inteiros
        meuArray = new int[10];

        meuArray[0] = 100;
        meuArray[1] = 85;
        meuArray[2] = 39;
        meuArray[3] = 86;
        meuArray[4] = 55;
        meuArray[5] = 76;
        meuArray[6] = 182;
        meuArray[7] = 12;
        meuArray[8] = 123;
        meuArray[9] = 10;

        System.out.println(meuArray[8]);
        System.out.println(meuArray[2]);

    }
    public static void tamanhoArray(){
        System.out.println("**** Tamanho do Array ****");
        int[] arrayUm = {12,3,5,68,6,9,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if(arrayDois.length > 8) {
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        } else {
            System.out.println("Tamanho do ArrayDois - Menor que 8");
        }
        System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
    }
    public static void percorrendoArray1(){
        System.out.println("**** Percorrendo Array 1 ****");
        int[] arrayUm = {86,68,52,5,49,83,45,12,64};
        int total = 0;
        for (int i : arrayUm) {
            System.out.println(i);
            total += i;
        }
        System.out.println("Total de elementos arrayUm " + total);
    }
    public static void percorrendoArray2(){
        System.out.println("**** Percorrendo Array 2 ****");
        int[] arrayDois = {86,68,52,5,49,83,45,12,6468,52,5};
        for (int i = 0; i < arrayDois.length; i++) {
            System.out.println(arrayDois[i]);
        }
    }
    public static void arrayBidimensional(){
        System.out.println("**** ARRAY BIDIMENSIONAL ****");
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2}, {3}, {4,5,6}};

        System.out.println("Valores no array1 passados na linha são: ");
        outputArray(array1); //exibe o array 1 por linha

        System.out.println("Valores no array2 passados na linha são: ");
        outputArray(array2); //exibe o array 2 por linha
    }

    public static void outputArray(int[][] array) {
        //FAZ LOOP PELAS LINHAS DO ARRAY
        for (int[] ints : array) {
            //FAZ LOOP PELAS COLUNAS DO ARRAY
            for (int coluna = 0; coluna < ints.length; coluna++) {
                System.out.printf("%d ", ints[coluna]);
            }
            System.out.println();
        }
    }


}
