/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author kuzniarg
 */
public class ZbiorPunktow {

    private ArrayList<Punkt> zbior;
    private double pole = 0;

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

    public boolean pusty() {
        return this.zbior.isEmpty();
    }

    public Punkt wezPunkt(int i) {
        return zbior.get(i);
    }

    public int wielkosc() {
        return zbior.size();
    }

    public void przesunPunkty(double x, double y) {
        for (int i = 0; i < zbior.size(); i++) {
            zbior.get(i).przesun(x, y);
        }
    }

    public void ustalPunktO(int pomN) {
        Punkt pom = zbior.get(pomN);
        zbior.set(pomN, zbior.get(0));
        zbior.set(0, pom);

        zbior.get(0).setKat(0);
        zbior.get(0).setWypukly(true);
        zbior.get(0).setOdleglosc(0);
    }

    public void sortuj() {
        Comparator<? super Punkt> c = null;
        this.zbior.sort(c);
        int i = 0;
        while (i < zbior.size()) {
            if (zbior.get(i).getX() == 0 && zbior.get(i).getY() == 0 && zbior.get(i).getKat() == 0 && zbior.get(i).getOdleglosc() == 0 && !zbior.get(i).czyWypukly()) {
                zbior.remove(i);
            }
            i++;

        }
    }

    public void usun(int i) {
        zbior.remove(i);
    }

    public void oczysc() {
        for (int i = 0; i < this.wielkosc(); i++) {
            if (!zbior.get(i).czyWypukly()) {
                zbior.remove(i);
            }
        }
    }

    public void setPole(double p) {
        this.pole = p;
    }

    public double getPole() {
        return this.pole;
    }

    double znajdzYduze() {
        double max = 0;
        for (int i = 0; i < zbior.size(); i++) {
            if (max < zbior.get(i).getY()) {
                max = zbior.get(i).getY();
            }
        }
        return max;
    }

    double znajdzYmale() {
        double min = 0;
        for (int i = 0; i < zbior.size(); i++) {
            if (min > zbior.get(i).getY()) {
                min = zbior.get(i).getY();
            }
        }
        return min;
    }

    double znajdzXduze() {
        double max = 0;
        for (int i = 0; i < zbior.size(); i++) {
            if (max < zbior.get(i).getX()) {
                max = zbior.get(i).getX();
            }
        }
        return max;
    }

    double znajdzXmale() {
        double min = 0;
        for (int i = 0; i < zbior.size(); i++) {
            if (min > zbior.get(i).getX()) {
                min = zbior.get(i).getX();
            }
        }
        return min;
    }
}
