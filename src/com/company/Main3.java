package com.company;
import java.io.File;
import java.io.FileInputStream;
import  java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.System.exit;

public class Main3 {
    public static void main(String[] args)
    {

        FileInputStream fis=null;
        try{
             fis = new FileInputStream("src/text.txt");
        }catch (FileNotFoundException e)
        {
            System.out.println("Plik nie istnieje");
            exit(1);
        }
        int x=0;
        try {
            x=fis.read();
            while (x!=-1) {
                System.out.print((char)x);
                x = fis.read();
            }
        }catch(IOException e)
        {
            System.out.println("Nie udało się odczytać pliku");
            exit(2);
        }
        try{
            fis.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
