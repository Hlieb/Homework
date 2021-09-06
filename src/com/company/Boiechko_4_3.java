package com.company;

import java.util.Scanner;
import java.util.Random;


public class Boiechko_4_3 {

    //Найти сумму элементов на главной диагонали матрицы размером n*n, где n вводится пользователем с клавиатуры
    static Scanner scan = new Scanner(System.in);
    static int n;
    static Random random = new Random();
    static int[][] array;

    public static void main(String[] args) {
        System.out.println("Vvedite razmer massivov n: ");
        n = scan.nextInt();
        array = new int[n][n];
        System.out.println("Elementy masiva: ");
        SozdatElementyMasiva();
        VyvestiMasiv();
        SumaMasiva();
    }

    public static void SozdatElementyMasiva() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public static void VyvestiMasiv() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t ");
            }
            System.out.println("\n");
        }

    }

    public static void SumaMasiva() {
        int suma = 0;
        for (int i = 0, j = 0; i < array.length && j < array.length; i++, j++) {
            suma += array[i][j];
        }
        System.out.println("Suma elementov glavnoj diagonali: "+ suma);
    }
}













