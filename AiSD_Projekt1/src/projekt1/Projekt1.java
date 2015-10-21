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
import java.io.PrintStream;
import static projekt1.Pliki.wczytajPlik;

/**
 *
 * @author kuzniarg
 */
public class Projekt1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //PrintStream Bledy = null;
        //System.setErr(Bledy);
        
        if (args.length < 1) {
            System.out.println("Brak danych na wejściu.");
            return;
        }
        File plik = new File(".//src//Teksty//" + args[0]);

        ZbiorPunktow zbior = new ZbiorPunktow();

        wczytajPlik(plik, zbior);
        if (zbior.pusty()) {
            System.err.println("Brak poprawnych danych w podanym pliku");
        }

        //TEST
        System.out.println(zbior);
        
        AlgorytmGrahama.znajdzOtoczke(zbior);
    
        //TEST
        System.out.println(zbior);
        
    }
}
