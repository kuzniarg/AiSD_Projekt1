/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author kuzniarg
 */
public class Projekt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        if (args.length < 1) {
            System.out.println("Brak danych na wejściu.");
            return;
        }
        File plik = new File(".//src//Teksty//tekst.txt");
        
        ZbiorPunktow zbior = new ZbiorPunktow();
        
        String tekst = wczytajPlik(plik, zbior);
        
        System.out.println(tekst);
        System.out.println(zbior);
    }

public static String wczytajPlik(File plik, ZbiorPunktow zbior) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(plik);
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String linia, tekst = "";
        int n=0, k=1;
        double a = 0, b = 0;
        while((linia = bufferReader.readLine()) != null) {
            n=0;
            if (linia.contains(" ")){
                a = Double.parseDouble(linia.substring(0, linia.indexOf(" ")));
                linia = linia.substring(linia.indexOf(" ")+1);
                if (!linia.contains(" "))
                    b = Double.parseDouble(linia);
                else{
                    n++;
                    linia = "";
                }
            }
            else System.err.println("Błąd w danych. Linia: " + k);
            
            if (n==1)
                System.err.println("Błąd w danych. Linia: " + k);
            else 
            zbior.dodajPunkt(a, b);
            k++;
        }
        fileReader.close();
        return tekst;
}    }