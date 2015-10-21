/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

/**
 *
 * @author kuzniarg
 */
public class AlgorytmGrahama {

    public static void znajdzOtoczke(ZbiorPunktow zbior) {
        int i = 1, pomN = 0;
        while (i < zbior.wielkosc()) {
            if (zbior.wezPunkt(pomN).getY() == zbior.wezPunkt(i).getY()) {
                if (zbior.wezPunkt(pomN).getX() > zbior.wezPunkt(i).getX()) {
                    pomN = i;
                }
            } else if (zbior.wezPunkt(pomN).getY() > zbior.wezPunkt(i).getY()) {
                pomN = i;
            }
            i++;
        }
        zbior.wezPunkt(pomN).setWypukly(true);
        ustalPoczatekUkladu(zbior, zbior.wezPunkt(pomN));
    }

    private static void ustalPoczatekUkladu(ZbiorPunktow zbior, Punkt punkt) {
        double x = punkt.getX(), y = punkt.getY();
        zbior.przesunPunkty(x, y);
    }

}
