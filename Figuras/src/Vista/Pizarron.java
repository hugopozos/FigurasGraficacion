/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author pozos
 */

public class Pizarron extends javax.swing.JPanel {

    int[] colors = new int[3];

    public Pizarron() {
        initComponents();
    }
    
    public void draw(){
        Graphics g = this.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
    }

    public void paint(String texto) {
        String txt[];
        txt = texto.split(",|\\n");
        for (int i = 0; i < txt.length; i++) {
            try {
                switch (txt[i].charAt(0)) {
                    case 'L':
                        colors(txt, i);
                        cords(txt, i, 2);
                        break;
                    case 'T':
                        colors(txt, i);
                        cords(txt, i, 3);
                        break;
                    case 'R':
                        colors(txt, i);
                        cords(txt, i, 4);
                        break;
                    case 'P':
                        if (txt[i].charAt(1) == 'e') {
                            colors(txt, i);
                            cords(txt, i, 5);
                        } else {
                            colors(txt, i);
                            cords(txt, i, Integer.valueOf(String.valueOf(txt[i].charAt(8))));
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            }

        }
    }

    public void paintBb(int[] x, int[] y) {
        Graphics g = this.getGraphics();
        for (int i = 0; i < 3; i++) {
        }
        g.setColor(new Color(colors[2], colors[1], colors[0]));
        if (x.length == 2) {
            g.drawLine(x[0], y[0], x[1], y[1]);
        }
        g.fillPolygon(x, y, x.length);
    }

    public void colors(String[] txt, int i) {
        colors[0] = Integer.valueOf(txt[i - 1]);
        colors[1] = Integer.valueOf(txt[i - 2]);
        colors[2] = Integer.valueOf(txt[i - 3]);
    }

    public void cords(String[] txt, int i, int points) {
        i = i - (points * 2) - 4;
        int[] y = new int[points];
        int[] x = new int[points];
        int k = 0;
        for (int j = 0; j < points * 2; j++) {
            if (j % 2 == 0) {
                int a = Integer.valueOf(txt[i]);
                x[k] = a;
            } else {
                int b = Integer.valueOf(txt[i]);
                y[k] = b;
                k++;
            }
            i++;
        }
        paintBb(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
