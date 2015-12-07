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
public class Punkt implements Comparable<Punkt> {

    private double x, y;
    private boolean czyWypukly;
    private double kat;
    private double odleglosc;

    public Punkt(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public boolean czyWypukly() {
        return this.czyWypukly;
    }

    public void setWypukly(boolean A) {
        this.czyWypukly = A;
    }

    @Override
    public String toString() {
        return x + "\t" + y + "\t" + czyWypukly + "\t\t" + (int) kat + "\t" + odleglosc;
    }

    public void przesun(double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    public void setKat(double k) {
        this.kat = k;
    }

    public double getKat() {
        return this.kat;
    }

    public void setOdleglosc(double k) {
        this.odleglosc = k;
    }

    public double getOdleglosc() {
        return this.odleglosc;
    }

    @Override
    public int compareTo(Punkt o) {
        if (this.kat < o.getKat()) {
            return -1;
        } else if (this.kat > o.getKat()) {
            return 1;
        } else if (this.odleglosc < o.getOdleglosc()) {
            return 1;
        } else if (this.odleglosc > o.getOdleglosc()) {
            return -1;
        } else {
            this.setDel();
            return 0;
        }
    }

    private void setDel() {
        this.x = 0;
        this.y = 0;
        this.odleglosc = 0;
        this.kat = 0;
        this.czyWypukly = false;
    }
}
