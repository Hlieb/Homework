package com.company;
//создать последовательность случайных чисел, найти и вывести самое большое из них
import java.util.Random;
import java.util.Scanner;

public  class Boiechko_4_1 {
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
        poluchitMaxMasiva();
    }
    public static void massiveElement() {
        for (int i = 0; i < razmer; i++) {
            array[i] = random.nextInt(100);
            System.out.print(" " + array[i]);
        }
    }
    public static void poluchitMaxMasiva() {
        int max=0;
        for (int i = 0; i < razmer; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maksimalnyje chyslo:" + max);
    }
}



















