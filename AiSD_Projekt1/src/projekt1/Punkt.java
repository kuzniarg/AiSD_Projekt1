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
public class Punkt {
    private double x,y;
    private boolean czyWypukly;

    public Punkt (double a, double b){
        this.x = a;
        this.y = b;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public boolean czyWypukly(){
        return this.czyWypukly;
    }
    
    public void setWypukly(boolean A){
        this.czyWypukly = A;
    }
    
    @Override
    public String toString(){
        return x + "\t" + y;
    }

    void przesun(double x, double y) {
        this.x -= x;
        this.y -= y;
    }
}
