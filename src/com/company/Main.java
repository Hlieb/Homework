package com.company;

import java.util.Random;
import java.util.Scanner;
//Создать массив, заполнить его случайными элементами, расспечатать, перевернуть и снова расспечатать

public class Main {
    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);
    public static int[] array;
    public static int razmer;
    public static void main(String[] args) {
        System.out.println("Vvedite razmer masiva");
        razmer = scan.nextInt();
        array = new int[razmer];
        System.out.print("Elementy masiva: ");
        massiveElement();
        System.out.println("");
        System.out.print("Perevernutyj masiv: ");
        perevernutMasiv(array);
        for (int a = 0; a < array.length; a++) {
            System.out.print(" " + array[a]);

        }
    public static void massiveElement() {
        for (int i = 0; i < razmer; i++) {
            array[i] = random.nextInt(100);
            System.out.print(" " + array[i]);
        }
    }

    public static void perevernutMasiv(int[]array) {
        for (int i = 0; i < array.length-1 ; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        }
    }
    }




