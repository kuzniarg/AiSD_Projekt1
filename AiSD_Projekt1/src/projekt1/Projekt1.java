/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static projekt1.MetodaMonteCarlo.MetodaMonteCarlo;
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

        ZbiorPunktow zbior = new ZbiorPunktow();
        int plikN = 0;

        while (plikN < args.length) {
            File plik = new File(".//src//Teksty//" + args[plikN]);
            wczytajPlik(plik, zbior);
            plikN++;
        }

        if (zbior.pusty()) {
            System.err.println("Brak poprawnych danych.");
            return;
        }
        if (zbior.wielkosc() <= 2) {
            System.err.println("Za mało punktów (" + zbior.wielkosc() + "), aby policzyć pole figury.");
            return;
        }

        //TEST
        //System.out.println(zbior);
        AlgorytmGrahama.znajdzOtoczke(zbior);
        zbior.oczysc();

        if (zbior.wielkosc() <= 2) {
            System.err.println("Za mało punktów niewspółliniowych (" + zbior.wielkosc() + "), aby policzyć pole figury.");
            return;
        }

        //TEST
        System.out.println(zbior);

        MetodaMonteCarlo(zbior);
        //TEST
        System.out.println("Wielkość pola figury opisywanej przez punkty wypukłe wynosi " + zbior.getPole());
    }
}
