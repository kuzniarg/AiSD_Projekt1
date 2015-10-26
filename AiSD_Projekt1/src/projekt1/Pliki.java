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
public class Pliki {

    public static void wczytajPlik(File plik, ZbiorPunktow zbior) throws FileNotFoundException, IOException {
        try (FileReader fileReader = new FileReader(plik)) {
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String linia;
            int n = 0, k = 1;
            double a = 0, b = 0;
            while ((linia = bufferReader.readLine()) != null) {
                n = 0;
                if (linia.contains(" ")) {
                    if (jestLiczba(linia.substring(0, linia.indexOf(" ")))) {
                        a = Double.parseDouble(linia.substring(0, linia.indexOf(" ")));
                        linia = linia.substring(linia.indexOf(" ") + 1);
                        if (jestLiczba(linia)) {
                            if (!linia.contains(" ")) {
                                b = Double.parseDouble(linia);
                            } else {
                                n++;
                                linia = "";
                            }
                        } else {
                            System.err.println("Błąd w " + plik.getName() + ". Podano conajmniej jedną literę. Linia: " + k);
                            n = 5;
                        }
                    } else {
                        System.err.println("Błąd w " + plik.getName() + ". Podano conajmniej jedną literę. Linia: " + k);
                        n = 5;
                    }
                }
                if (n == 1) {
                    System.err.println("Błąd w " + plik.getName() + ". Podano za dużo liczb. Linia: " + k);
                } else if (n == 0) {
                    zbior.dodajPunkt(a, b);
                }
                k++;
            }
            if (k==1)
                System.err.println("Brak poprawnych danych w pliku " + plik.getName());
            else
                System.out.println("Poprawnie wczytano dane z pliku " + plik.getName());
        }
    }

    private static boolean jestLiczba(String tekst) {
        int i = 0;
        while (i < tekst.length()) {
            if (tekst.charAt(i) >= '0' && tekst.charAt(i) <= '9') {
                i++;
            } else if (tekst.charAt(i) == '.' || tekst.charAt(i) == '-' || tekst.charAt(i) == ' ') {
                i++;
            } else {
                return false;
            }
        }
        return true;

    }
}
