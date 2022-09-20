package com.sosos.programming.xmass;

import java.util.Random;

public class ChristmassTreeDrawer {
    public static void drawTreeLevel(int maxSize, int space, char[] decorations) {
        int treeSize = 1;
        Random random = new Random();
        if (!(maxSize >= 3 && maxSize % 2 != 0)) {
            throw new IllegalArgumentException("Czytaj ze zrozumieniem"); // Wyjątek
        }
        while (treeSize <= maxSize) {
            for (int idx = 0; idx < space; idx++) {
                System.out.print(" ");
            }

            for (int idx = 0; idx < treeSize; idx++) {
                if (random.nextInt(100) < 75) {
                    System.out.print("\u001B[36m" + "x" + "\u001B[0m");
                } else {
                    int color = random.nextInt(8);
                    System.out.print("\u001B[3" + color + "m" + decorations[random.nextInt(decorations.length)] + "\u001B[0m");
                }
            }
            System.out.print("\n");
            space--;
            treeSize += 2;
        }
    }
}
