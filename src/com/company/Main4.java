package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/out.txt");
            for (int i = 0; i < napis.length(); i++) {
                fos.write((int) napis.charAt(i));
            }
        } catch (IOException e) {
            System.out.println("Błąd" + e);
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}