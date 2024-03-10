package view;

import fateczl.privatecode.Sorts.*;

public class Main {
    public static void main(String[] args) {
        Bubble_Sort bubbleSort = new Bubble_Sort();
        Merge_Sort mergeSort = new Merge_Sort();


        int[] vetor1 = {74 ,20 ,74 ,87 ,81 ,16 ,25 ,99 ,44 ,58};
        int[] vetor2 = {44 ,43 ,42 ,41 ,40 ,39 ,38};

//        bubbleSort.bubbleSort(vetor1);
        bubbleSort.bubbleSort(vetor2);
        for (int i: vetor2) {
            System.out.print(i + " ");
        }

        System.out.println();

        mergeSort.mergeSort(vetor1,0,vetor1.length -1);
//        mergeSort.mergeSort(vetor2,0,vetor1.length -1);
        for (int i: vetor1) {
            System.out.print(i + " ");
        }

    }
}
