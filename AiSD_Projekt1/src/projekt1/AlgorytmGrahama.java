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
        zbior.ustalPunktO(pomN);
        ustalPoczatekUkladu(zbior);
        obliczWartosci(zbior);
    }

    private static void ustalPoczatekUkladu(ZbiorPunktow zbior) {
        double x = zbior.wezPunkt(0).getX(), y = zbior.wezPunkt(0).getY();
        zbior.przesunPunkty(x, y);
    }

    private static void obliczWartosci(ZbiorPunktow zbior) {
        for (int i = 1; i < zbior.wielkosc(); i++) {
            zbior.wezPunkt(i).setOdleglosc(Math.sqrt(Math.pow(zbior.wezPunkt(i).getX(), 2) + Math.pow(zbior.wezPunkt(i).getY(), 2)));
            if (zbior.wezPunkt(i).getX() == 0) {
                zbior.wezPunkt(i).setKat(90);
            } else if (zbior.wezPunkt(i).getY() == 0) {
                zbior.wezPunkt(i).setKat(0);
            } else {
                double pom;
                pom = Math.atan(zbior.wezPunkt(i).getY() / zbior.wezPunkt(i).getX());
                pom = Math.toDegrees(pom);
                if (pom < 0)
                    pom = -(pom - 90);
                zbior.wezPunkt(i).setKat(pom);
            }
        }
    }

}
