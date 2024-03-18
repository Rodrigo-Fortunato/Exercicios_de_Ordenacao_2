package view;

import fateczl.privatecode.Sorts.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bubble_Sort bubbleSort = new Bubble_Sort();
        Merge_Sort mergeSort = new Merge_Sort();
        Quick_Sort quickSort = new Quick_Sort();
        Random random = new Random();


        int[] vetor1 = {74 ,20 ,74 ,87 ,81 ,16 ,25 ,99 ,44 ,58};
        int[] vetor2 = {44 ,43 ,42 ,41 ,40 ,39 ,38};
        int[] vetor3 ={31 ,32, 33, 34, 99, 98, 97, 96};

        int[] vetor4 = new int[1000000];
        int[] tempvet = new int[1000000];

        for (int cont=0;cont < vetor4.length;cont++) {
            vetor4[cont] = random.nextInt(5000);
        }
        double tempoIni = System.nanoTime();
        tempvet = quickSort.quickSort(vetor4.clone(),0, vetor4.length-1);
        double tempoFim = System.nanoTime();
        System.out.println("Quick Sort: " + (tempoFim-tempoIni)/Math.pow(10,9));
       /* for (int i: tempvet) {
            System.out.print(i + " ");
        }*/

        tempoIni = System.nanoTime();
        tempvet = mergeSort.mergeSort(vetor4.clone(), 0, vetor4.length - 1);
        tempoFim = System.nanoTime();
        System.out.println("Merge Sort: " +(tempoFim-tempoIni)/Math.pow(10,9));
       /* for (int i : tempvet) {
            System.out.print(i + " ");
        }*/

        tempoIni = System.nanoTime();
        tempvet = bubbleSort.bubbleSort(vetor4.clone());
        tempoFim = System.nanoTime();
        System.out.println("Bubble Sort: " + (tempoFim-tempoIni)/Math.pow(10,9));
       /* for (int i: tempvet) {
            System.out.print(i + " ");
        }*/


    }
}
