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
        zbior.sortuj();

        if (zbior.wielkosc() < 3) {
            return;
        }

        if (zbior.wielkosc() == 3) {
            if (zbior.wezPunkt(1).getKat() == zbior.wezPunkt(2).getKat()) {
                return;
            } else {
                zbior.wezPunkt(1).setWypukly(true);
                zbior.wezPunkt(2).setWypukly(true);
            }
        }

        algorytm(zbior);
    }

    private static void ustalPoczatekUkladu(ZbiorPunktow zbior) {
        double x = zbior.wezPunkt(0).getX(), y = zbior.wezPunkt(0).getY();
        zbior.przesunPunkty(x, y);
    }

    private static void obliczWartosci(ZbiorPunktow zbior) {
        for (int i = 1; i < zbior.wielkosc(); i++) {
            zbior.wezPunkt(i).setOdleglosc(Math.sqrt(Math.pow(zbior.wezPunkt(i).getX(), 2) + Math.pow(zbior.wezPunkt(i).getY(), 2)));
            if (zbior.wezPunkt(i).getX() == 0 && zbior.wezPunkt(i).getY() != 0) {
                zbior.wezPunkt(i).setKat(90);
            } else if (zbior.wezPunkt(i).getY() == 0) {
                zbior.wezPunkt(i).setKat(0);
            } else {
                double pom;
                pom = Math.atan(zbior.wezPunkt(i).getY() / zbior.wezPunkt(i).getX());
                pom = Math.toDegrees(pom);
                if (pom < 0) {
                    pom += 180;
                }
                zbior.wezPunkt(i).setKat(pom);
            }
        }
    }

    private static void algorytm(ZbiorPunktow zbior) {
        Punkt A, B, C;
        int i = 1;

        while (i < zbior.wielkosc() - 2) {
            A = zbior.wezPunkt(i);
            B = zbior.wezPunkt(i + 1);
            C = zbior.wezPunkt(i + 2);

            Punkt pom1 = new Punkt(A.getX() - C.getX(), A.getY() - C.getY()), pom2 = new Punkt(A.getX() - B.getX(), A.getY() - B.getY());

            double iloczynWek = pom1.getX() * pom2.getY() - pom2.getX() * pom1.getY();
            if (iloczynWek > 0) {
                zbior.usun(i + 1);
                if (i > 1) {
                    i--;
                }
            } else {
                B.setWypukly(true);
            }
            A.setWypukly(true);
            i++;
        }
        zbior.wezPunkt(i + 1).setWypukly(true);
    }

}
