package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.System.exit;

public class Main6 {
    public static void main(String[] args)
    {  FileInputStream fis=null;
        String text=" ";
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
                while (x != -1) {
                    text=text+((char) x);

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
        long lines;
        try {
            Path path = Paths.get("src/text.txt");
            lines = Files.lines(path).count();
            int j =0;
            for(int i = 1;i<=lines;i++)
            {
                var line = text.split("\n");
                System.out.println(i+". "+line[j]);
                j++;
            }
        }catch (IOException e) {
        }
        }

        }
