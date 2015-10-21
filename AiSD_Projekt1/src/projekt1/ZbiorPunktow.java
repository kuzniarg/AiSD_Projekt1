/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

import java.util.ArrayList;

/**
 *
 * @author kuzniarg
 */
public class ZbiorPunktow {

    private ArrayList<Punkt> zbior;

    public ZbiorPunktow() {
        zbior = new ArrayList<>();
    }

    public void dodajPunkt(double a, double b) {
        Punkt p = new Punkt(a, b);
        zbior.add(p);
    }

    @Override
    public String toString() {
        String druk = "X\tY\tWypuklosc\tKat\tOdleglosc\n";
        int i = 0;
        while (i < zbior.size()) {
            druk += zbior.get(i) + "\n";
            i++;
        }
        if ("".equals(druk)) {
            return "null";
        }
        return druk;
    }

    boolean pusty() {
        return this.zbior.isEmpty();
    }

    Punkt wezPunkt(int i) {
        return zbior.get(i);
    }

    int wielkosc() {
        return zbior.size();
    }

    void przesunPunkty(double x, double y) {
        for (int i = 0; i < zbior.size(); i++) {
            zbior.get(i).przesun(x, y);
        }
    }

    void ustalPunktO(int pomN) {
        Punkt pom = zbior.get(pomN);
        zbior.set(pomN, zbior.get(0));
        zbior.set(0, pom);

        zbior.get(0).setKat(0);
        zbior.get(0).setWypukly(true);
        zbior.get(0).setOdleglosc(0);
    }
}
