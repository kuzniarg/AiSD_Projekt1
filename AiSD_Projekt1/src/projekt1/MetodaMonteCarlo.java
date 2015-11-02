/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

import java.util.Random;

/**
 *
 * @author kuzniarg
 */
public class MetodaMonteCarlo {

    public static void MetodaMonteCarlo(ZbiorPunktow zbior) {
        double Y = zbior.znajdzYduze(), Xd = zbior.znajdzXduze(), Xm = zbior.znajdzXmale(), pole = 0;
        int ileLos = 10, TAK = 0, NIE = 0;

        for (int i = 0; i < ileLos; i++) {
            Punkt punkt = new Punkt(losuj(0, Y), losuj(Xm, Xd));
            //Sprawdź czy punkt należy do figury
            
        }
        
        pole = Y * (Xd - Xm) * TAK / (TAK + NIE);
        zbior.setPole(pole);

    }

    private static double losuj(double a, double b) {
        double los;
        Random r = new Random();
        los = a + r.nextDouble() * 1000000 % (b - a);
        return los;
    }
}
