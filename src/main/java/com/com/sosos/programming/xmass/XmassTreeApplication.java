package com.sosos.programming.xmass;

import java.util.Scanner;

public class XmassTreeApplication {
    public static void main(String[] args) {
        int size = 1; //rozmiar

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nieparzystą i większą od 3 liczbę.");
        size = scanner.nextInt();
        while (!(size >= 3 && size % 2 != 0)) {
            if (size < 3) {
                System.out.println("TYLKO LICZBY WIĘKSZE LUB RÓWNE 3!");
            }
            if (size % 2 == 0) {
                System.out.println("TYLKO LICZBY NIEPARZYSTE!");
            }
            size = scanner.nextInt();
        }

        int treeSize = 1; // to będą x
        int space = size / 2 + 2; // spacje


        drawTreeLevel(treeSize, size, space);

        drawTreeLevel(treeSize, size + 2, space);

        drawTreeLevel(treeSize, size + 4, space);
    }

    public static void drawTreeLevel(int treeSize, int maxSize, int space) {
        while (treeSize <= maxSize) {
            for (int idx = 0; idx < space; idx++) {
                System.out.print(" ");
            }

            for (int idx = 0; idx < treeSize; idx++) {
                System.out.print("x");
            }
            System.out.print("\n");
            space--;
            treeSize += 2;
        }
    }

}

