package com.sosos.programming.xmass;

import java.util.Random;
import java.util.Scanner;


public class XmassTreeApplicationV2 {
    public static void main(String[] args) {
        int size = 1; //rozmiar
        char[] decoratons = {'o', 's', 'c', 'Ó'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nieparzystą i większą od 3 liczbę.");
        size = scanner.nextInt();

        int space = size / 2 + 2; // spacje

        ChristmassTreeDrawer.drawTreeLevel(size, space, decoratons);

        ChristmassTreeDrawer.drawTreeLevel(size + 2, space, decoratons);

        ChristmassTreeDrawer.drawTreeLevel(size + 4, space, decoratons);
    }
}
