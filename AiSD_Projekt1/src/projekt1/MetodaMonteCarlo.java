/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import static projekt1.Projekt1.zbior;

/**
 *
 * @author kuzniarg
 */
public class MetodaMonteCarlo {

    private static int n;
    private static double px; //Współrzędna X badanego punktu (zamiast punkt.getX())
    private static double py; //Współrzędna Y badanego punktu (zamiast punkt.getY())
    private static double rx; //Współrzędna X końca prostej
    private static double ry; //Współrzędna Y końca prostej
    private static double polygonx[];
    private static double polygony[];
    private static double tmpx;
    private static double tmpy;
    private static int k;

    public static void MetodaMonteCarlo(int ileLos, JPanel panelRys) {
        n = zbior.wielkosc();

        double Y = zbior.znajdzYduze(), Xd = zbior.znajdzXduze(), Xm = zbior.znajdzXmale(), pole;
        int TAK = 0, NIE = 0;

        rysujObszar(Y, Xm, Xd, panelRys);

        for (int i = 0; i < ileLos; i++) {
            Punkt punkt = new Punkt(losuj(Xm, Xd), losuj(0, Y));
            if (czyPunktWFigurze(punkt)) {
                TAK++;
                dodajPunkt(punkt.getX(), punkt.getY(), true, panelRys);
            } else {
                NIE++;
                dodajPunkt(punkt.getX(), punkt.getY(), false, panelRys);
            }
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

    private static boolean czyPunktWFigurze(Punkt punkt) {
        px = punkt.getX();
        py = punkt.getY();

        rx = zbior.znajdzXduze() + 1;
        ry = py;

        int liczbaPrzeciec = 0;
        for (int i = 0; i < n; i++) {
            k = i;
            if (przynaleznosc(zbior.wezPunkt(i).getX(), zbior.wezPunkt(i).getY(), zbior.wezPunkt((i + 1) % n).getX(), zbior.wezPunkt((i + 1) % n).getY(), px, py)) {
                return true;
            }
            if (przecinanie(zbior.wezPunkt(i).getX(), zbior.wezPunkt(i).getY(), zbior.wezPunkt((i + 1) % n).getX(), zbior.wezPunkt((i + 1) % n).getY())) {
                liczbaPrzeciec++;
            }
        }
        return (liczbaPrzeciec % 2) != 0;
    }

    private static boolean przynaleznosc(double xx, double xy, double yx, double yy, double zx, double zy) {
        double det = det(xx, xy, yx, yy, zx, zy);
        if (det != 0) {
            return false;
        } else if ((Math.min(xx, yx) <= zx) && (zx <= Math.max(xx, yx))
                && (Math.min(xy, yy) <= zy) && (zy <= Math.max(xy, yy))) {
            return true;
        } else {
            return false;
        }
    }

    //Wyznacznik macierzy kwadratowej stopnia 3.
    private static double det(double xx, double xy, double yx, double yy, double zx, double zy) {
        return (xx * yy + yx * zy + zx * xy - zx * yy - xx * zy - yx * xy);
    }

    private static boolean przecinanie(double ax, double ay, double bx, double by) {
        if (!przynaleznosc(px, py, rx, ry, ax, ay)
                && !przynaleznosc(px, py, rx, ry, bx, by)) {
            //polprosta nie przecina odcinka |AB| w koncach
            if ((Math.signum(det(px, py, rx, ry, ax, ay)) != Math.signum(det(px, py, rx, ry, bx, by)))
                    && (Math.signum(det(ax, ay, bx, by, px, py)) != Math.signum(det(ax, ay, bx, by, rx, ry)))) {
                return true;
            } else {
                return false;
            }
        } else //do polprostej nalezy przynajmniej jeden koniec odcinka |AB|
        {
            if (przynaleznosc(px, py, rx, ry, ax, ay)
                    && przynaleznosc(px, py, rx, ry, bx, by)) {
                if (Math.signum(det(px, py, rx, ry, polygonx[(k - 1 + n) % n], polygony[(k - 1 + n) % n])) == Math.signum(det(px, py, rx, ry, polygonx[(k + 2) % n], polygony[(k + 2) % n]))
                        && Math.signum(det(px, py, rx, ry, polygonx[(k - 1 + n) % n], polygony[(k - 1 + n) % n])) != 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (przynaleznosc(px, py, rx, ry, polygonx[(k - 1 + n) % n], polygony[(k - 1 + n) % n])
                    || przynaleznosc(px, py, rx, ry, polygonx[(k + 2) % n], polygony[(k + 2) % n])) {
                return false;
            } else {
                //polprosta zawiera tylko wierzcholek
                if (przynaleznosc(px, py, rx, ry, bx, by)) {
                    tmpx = ax;
                    tmpy = ay;
                    return false;
                }
                if (przynaleznosc(px, py, rx, ry, ax, ay)) {
                    return !(Math.signum(det(px, py, rx, ry, tmpx, tmpy)) == Math.signum(det(px, py, rx, ry, bx, by))
                            && Math.signum(det(px, py, rx, ry, tmpx, tmpy)) != 0);
                }
            }
        }
        return false;
    }

    private static void dodajPunkt(double x, double y, boolean nalezy, JPanel panelRysuj) {
        Graphics g = panelRysuj.getGraphics();
        if (nalezy) {
            g.setColor(Color.green);
        } else {
            g.setColor(Color.red);
        }

        double wys = (panelRysuj.getHeight() - 12) / (zbior.znajdzYduze() - zbior.znajdzYmale()) / 2;
        double szer = (panelRysuj.getWidth() - 12) / (zbior.znajdzXduze() - zbior.znajdzXmale()) / 2;
        double wspol;
        if (wys < szer) {
            wspol = wys;
        } else {
            wspol = szer;
        }

        int x1 = panelRysuj.getWidth() / 2 + (int) (x * wspol) + 3;
        int y1 = panelRysuj.getHeight() / 2 - (int) (y * wspol) + 3;
        g.drawLine(x1, y1, x1, y1);
    }

    private static void rysujObszar(double y, double xm, double xd, JPanel panelRysuj) {
        Graphics g = panelRysuj.getGraphics();
        g.setColor(Color.magenta);

        double wys = (panelRysuj.getHeight() - 12) / (zbior.znajdzYduze() - zbior.znajdzYmale()) / 2;
        double szer = (panelRysuj.getWidth() - 12) / (zbior.znajdzXduze() - zbior.znajdzXmale()) / 2;
        double wspol;
        if (wys < szer) {
            wspol = wys;
        } else {
            wspol = szer;
        }

        int x1 = panelRysuj.getWidth() / 2 + (int) (xm * wspol) + 3;
        int y1 = panelRysuj.getHeight() / 2 - (int) (0 * wspol) + 3;
        int x2 = panelRysuj.getWidth() / 2 + (int) (xd * wspol) + 3;
        int y2 = panelRysuj.getHeight() / 2 - (int) (y * wspol) + 3;

        g.drawLine(x1, y1, x1, y2);
        g.drawLine(x2, y1, x2, y2);
        g.drawLine(x1, y1, x2, y1);
        g.drawLine(x1, y2, x2, y2);
    }

}
