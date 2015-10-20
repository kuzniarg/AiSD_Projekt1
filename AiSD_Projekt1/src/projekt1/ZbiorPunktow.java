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
        String druk = "";
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
}