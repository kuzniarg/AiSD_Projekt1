/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt1;

import java.awt.Color;
import java.awt.Graphics;
import static projekt1.MetodaMonteCarlo.MetodaMonteCarlo;
import static projekt1.Projekt1.zbior;

/**
 *
 * @author Grzechu
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRysuj = new javax.swing.JPanel();
        panelPrzyciski = new javax.swing.JPanel();
        przyciskPlik = new javax.swing.JButton();
        przyciskGraham = new javax.swing.JButton();
        przyciskMonte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        polePunkty = new javax.swing.JTextField();
        przyciskReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        polePole = new javax.swing.JTextField();
        przyciskWejscie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 640));
        setPreferredSize(new java.awt.Dimension(860, 640));
        setResizable(false);

        panelRysuj.setBackground(new java.awt.Color(255, 255, 255));
        panelRysuj.setLayout(new java.awt.BorderLayout());

        przyciskPlik.setText("Wybierz plik");
        przyciskPlik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskPlikActionPerformed(evt);
            }
        });

        przyciskGraham.setText("Algorytm Grahama");
        przyciskGraham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskGrahamActionPerformed(evt);
            }
        });

        przyciskMonte.setText("Metoda Monte Carlo");
        przyciskMonte.setEnabled(false);
        przyciskMonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskMonteActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Podaj liczbę punktów");

        polePunkty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        polePunkty.setText("10000");
        polePunkty.setMinimumSize(new java.awt.Dimension(6, 30));

        przyciskReset.setText("Reset");
        przyciskReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskResetActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pole figury");

        polePole.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        polePole.setText("0");

        przyciskWejscie.setText("Rysuj punkty");
        przyciskWejscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskWejscieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrzyciskiLayout = new javax.swing.GroupLayout(panelPrzyciski);
        panelPrzyciski.setLayout(panelPrzyciskiLayout);
        panelPrzyciskiLayout.setHorizontalGroup(
            panelPrzyciskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrzyciskiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrzyciskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(polePunkty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(przyciskPlik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(przyciskGraham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(przyciskMonte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(przyciskReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(polePole)
                    .addComponent(przyciskWejscie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrzyciskiLayout.setVerticalGroup(
            panelPrzyciskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrzyciskiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(przyciskPlik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(przyciskWejscie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(przyciskGraham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polePunkty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(przyciskMonte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(przyciskReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polePole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRysuj, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPrzyciski, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRysuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelPrzyciski, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void przyciskPlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskPlikActionPerformed
        GUIPlik.OknoPlikStart();
    }//GEN-LAST:event_przyciskPlikActionPerformed

    private void przyciskMonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskMonteActionPerformed
        wyczyscRysuj();
        rysujFigure();
        MetodaMonteCarlo(Integer.parseInt(this.polePunkty.getText()), panelRysuj);
        String tekst = "";
        tekst += zbior.getPole();
        this.polePole.setText(tekst);
        rysujFigure();
    }//GEN-LAST:event_przyciskMonteActionPerformed

    private void przyciskResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskResetActionPerformed
        zbior = new ZbiorPunktow();
        wyczyscRysuj();
        this.przyciskMonte.setEnabled(false);
        this.polePole.setText("0");
    }//GEN-LAST:event_przyciskResetActionPerformed

    private void przyciskGrahamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskGrahamActionPerformed
        wyczyscRysuj();

        if (zbior.pusty()) {
            System.err.println("Brak poprawnych danych.");
            return;
        }
        if (zbior.wielkosc() <= 2) {
            System.err.println("Za mało punktów (" + zbior.wielkosc() + "), aby policzyć pole figury.");
            return;
        }

            AlgorytmGrahama.znajdzOtoczke();
            zbior.oczysc();

        if (zbior.wielkosc() <= 2) {
            System.err.println("Za mało punktów niewspółliniowych (" + zbior.wielkosc() + "), aby policzyć pole figury.");
            return;
        }
        this.przyciskMonte.setEnabled(true);
        rysujFigure();
    }//GEN-LAST:event_przyciskGrahamActionPerformed

    private void przyciskWejscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskWejscieActionPerformed
        wyczyscRysuj();
        if (zbior.wielkosc() > 0) {
            Graphics g = panelRysuj.getGraphics();
            g.setColor(Color.blue);

            double wys = (this.panelRysuj.getHeight() - 12) / (zbior.znajdzYduze() - zbior.znajdzYmale()) / 2;
            double szer = (this.panelRysuj.getWidth() - 12) / (zbior.znajdzXduze() - zbior.znajdzXmale()) / 2;
            double wspol;
            if (wys < szer) {
                wspol = wys;
            } else {
                wspol = szer;
            }

            for (int i = 0; i < zbior.wielkosc(); i++) {
                int x = panelRysuj.getWidth() / 2 + (int) (zbior.wezPunkt(i).getX() * wspol);
                int y = panelRysuj.getHeight() / 2 - (int) (zbior.wezPunkt(i).getY() * wspol);
                g.fillOval(x, y, 6, 6);
            }
            g.setColor(Color.black);
            g.drawLine(panelRysuj.getWidth() / 2 + 3 - 5, panelRysuj.getHeight() / 2 - (int) wspol + 3, panelRysuj.getWidth() / 2 + 3 + 5, panelRysuj.getHeight() / 2 - (int) wspol + 3);
            g.drawLine(panelRysuj.getWidth() / 2 + (int) wspol + 3, panelRysuj.getHeight() / 2 + 3 - 5, panelRysuj.getWidth() / 2 + (int) wspol + 3, panelRysuj.getHeight() / 2 + 3 + 5);
        }
    }//GEN-LAST:event_przyciskWejscieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelPrzyciski;
    private javax.swing.JPanel panelRysuj;
    private javax.swing.JTextField polePole;
    private javax.swing.JTextField polePunkty;
    private javax.swing.JButton przyciskGraham;
    private javax.swing.JButton przyciskMonte;
    private javax.swing.JButton przyciskPlik;
    private javax.swing.JButton przyciskReset;
    private javax.swing.JButton przyciskWejscie;
    // End of variables declaration//GEN-END:variables

    private void wyczyscRysuj() {
        Graphics g = panelRysuj.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.black);
        g.drawLine(0, panelRysuj.getHeight() / 2 + 3, 1000, panelRysuj.getHeight() / 2 + 3);
        g.drawLine(panelRysuj.getWidth() / 2 + 3, 0, panelRysuj.getWidth() / 2 + 3, 1000);
    }

    private void rysujFigure() {
        int i;
        Graphics g = panelRysuj.getGraphics();
        g.setColor(Color.blue);

        double wys = (this.panelRysuj.getHeight() - 12) / (zbior.znajdzYduze() - zbior.znajdzYmale()) / 2;
        double szer = (this.panelRysuj.getWidth() - 12) / (zbior.znajdzXduze() - zbior.znajdzXmale()) / 2;
        double wspol;
        if (wys < szer) {
            wspol = wys;
        } else {
            wspol = szer;
        }

        for (i = 0; i < zbior.wielkosc(); i++) {
            int x = panelRysuj.getWidth() / 2 + (int) (zbior.wezPunkt(i).getX() * wspol);
            int y = panelRysuj.getHeight() / 2 - (int) (zbior.wezPunkt(i).getY() * wspol);
            g.fillOval(x, y, 6, 6);
        }

        for (i = 0; i < zbior.wielkosc() - 1; i++) {
            int x1 = panelRysuj.getWidth() / 2 + (int) (zbior.wezPunkt(i).getX() * wspol);
            int y1 = panelRysuj.getHeight() / 2 - (int) (zbior.wezPunkt(i).getY() * wspol);
            int x2 = panelRysuj.getWidth() / 2 + (int) (zbior.wezPunkt(i + 1).getX() * wspol);
            int y2 = panelRysuj.getHeight() / 2 - (int) (zbior.wezPunkt(i + 1).getY() * wspol);
            g.drawLine(x1 + 3, y1 + 3, x2 + 3, y2 + 3);
        }

        int x1 = panelRysuj.getWidth() / 2 + (int) (zbior.wezPunkt(i).getX() * wspol);
        int y1 = panelRysuj.getHeight() / 2 - (int) (zbior.wezPunkt(i).getY() * wspol);
        int x2 = panelRysuj.getWidth() / 2 + (int) (zbior.wezPunkt(0).getX() * wspol);
        int y2 = panelRysuj.getHeight() / 2 - (int) (zbior.wezPunkt(0).getY() * wspol);
        g.drawLine(x1 + 3, y1 + 3, x2 + 3, y2 + 3);

        g.setColor(Color.black);
        g.drawLine(panelRysuj.getWidth() / 2 + 3 - 5, panelRysuj.getHeight() / 2 - (int) wspol + 3, panelRysuj.getWidth() / 2 + 3 + 5, panelRysuj.getHeight() / 2 - (int) wspol + 3);
        g.drawLine(panelRysuj.getWidth() / 2 + (int) wspol + 3, panelRysuj.getHeight() / 2 + 3 - 5, panelRysuj.getWidth() / 2 + (int) wspol + 3, panelRysuj.getHeight() / 2 + 3 + 5);
    }
}
