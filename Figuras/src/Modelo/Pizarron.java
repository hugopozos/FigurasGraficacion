package Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import Vista.Menu;
import java.awt.Color;

/**
 *
 * @author pozos
 */

public abstract class Pizarron implements ActionListener, MouseListener, ChangeListener {

    final JFileChooser FileChooser = new JFileChooser();
    Menu menu = new Menu();
    int Points = 0;
    int Figures = 0;   
    static String data = "";

    public Pizarron(Menu frame) {
        this.menu = frame;
    }

    public Pizarron() {
    }

/*-----------------------------------------------------------------------------*/    
    //Streaming de datos 
    public void inputData(String archivo) {
        try {
            try (FileReader flujo = new FileReader(archivo); BufferedReader buffer = new BufferedReader(flujo)) {
                String linea = buffer.readLine();
                while (linea != null) {
                    data += linea + "\n";
                    linea = buffer.readLine();
                }
            }
            menu.panelPrincipal.paint(data);
        } catch (IOException e) {
        }
    }
/*-----------------------------------------------------------------------------*/
    public void outputData(String archivo) {
        try{
            FileOutputStream salida = new FileOutputStream(archivo + ".txt");
            byte[] txt = data.getBytes();
            salida.write(txt);
        } catch (IOException e) {
        }
    }
/*-----------------------------------------------------------------------------*/
    @Override
        public void mouseClicked(MouseEvent me) {
        if(menu.rbLinea.isSelected()){
            Points++;
            menu.lbContador.setText("Puntos: " + String.valueOf(Points));
            data += me.getX() + "," + me.getY() + "\n";
            if(Points == 2){
                Points = 0;
                menu.lbContador.setText("Puntos: 0");
                data += "\n" + String.valueOf(menu.spR.getValue()) + "," + String.valueOf(menu.spG.getValue()) + "," + String.valueOf(menu.spB.getValue());
                data += "\nLinea\n";
                menu.cbFiguras.addItem("Linea" + Figures);
                Figures++;
            }
        }else if(menu.rbTriangulo.isSelected()){
            Points++;
            menu.lbContador.setText("Puntos: " + String.valueOf(Points));
            data += me.getX() + "," + me.getY() + "\n";
            if(Points == 3){
                Points = 0;
                menu.lbContador.setText("Puntos: 0");
                data += "\n" + String.valueOf(menu.spR.getValue()) + "," + String.valueOf(menu.spG.getValue()) + "," + String.valueOf(menu.spB.getValue());
                data += "\nTriangulo\n";
                menu.cbFiguras.addItem("Triangulo" + Figures);
                Figures++;
            }
        }else if(menu.rbRectangulo.isSelected()){
            Points++;
            menu.lbContador.setText("Puntos: " + String.valueOf(Points));
            data += me.getX() + "," + me.getY() + "\n";
            if(Points == 4){
                Points = 0;
                menu.lbContador.setText("Puntos: 0");
                data += "\n" + String.valueOf(menu.spR.getValue()) + "," + String.valueOf(menu.spG.getValue()) + "," + String.valueOf(menu.spB.getValue());
                data += "\nRectangulo\n";
                menu.cbFiguras.addItem("Rectangulo" + Figures);
                Figures++;
            }
        }else if (menu.rbPentagono.isSelected()){
            Points++;
            menu.lbContador.setText("Puntos: " + String.valueOf(Points));
            data += me.getX() + "," + me.getY() + "\n";
            if(Points == 5){
                Points = 0;
                menu.lbContador.setText("Puntos: 0");
                data += "\n" + String.valueOf(menu.spR.getValue()) + "," + String.valueOf(menu.spG.getValue()) + "," + String.valueOf(menu.spB.getValue());
                data += "\nPentagono\n";
                menu.cbFiguras.addItem("Pentagono" + Figures);
                Figures++;
            }
        }menu.panelPrincipal.paint(data);
    }
/*-----------------------------------------------------------------------------*/        
    @Override
    public void actionPerformed(ActionEvent e) {
        int opc;
        String archivo;
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        FileChooser.setFileFilter(filtroImagen);
        //Eventos de Menu
        switch (e.getActionCommand()) {
            case "Abrir":
                opc = FileChooser.showOpenDialog(menu);
                if (opc == JFileChooser.APPROVE_OPTION) {
                    archivo = "" + FileChooser.getSelectedFile();
                    this.inputData(archivo);
                }
                break;
            case "Nuevo":
                data = "";
                menu.panelPrincipal.removeAll();
                data = "";
                menu.repaint(0, 0, 1000, 1000);
                menu.lbContador.setText("Puntos: 0");
                menu.cbFiguras.removeAllItems();
                menu.cbFiguras.addItem("Figura...");
                Figures = 0;
                break;
            case "Guardar":
                opc = FileChooser.showSaveDialog(menu);
                archivo = "" + FileChooser.getSelectedFile();
                outputData(archivo);
                break;
            case "i":
                searchFigures("i");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            case "d":
                searchFigures("d");
                searchFigures("t");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            case "a":
                searchFigures("a");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            case "ab":
                searchFigures("ab");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            case "+r":
                searchFigures("+r");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            case "-r":
                searchFigures("-r");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            case "+t":
                searchFigures("+t");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            case "-t":
                searchFigures("-t");
                menu.panelPrincipal.draw();
                menu.panelPrincipal.paint(data);
                break;
            default:
        }
    }
/*-----------------------------------------------------------------------------*/
    public void searchFigures(String buttonCommand) {
        String txt[];
        txt = data.split(",|\\n");
        int count = 0;
        int sides = 0;
        for (int i = 0; i < txt.length; i++) {
            try {
                switch (txt[i].charAt(0)) {
                    case 'L':
                        sides = 2;
                        count++;
                        break;
                    case 'T':
                        sides = 3;
                        count++;
                        break;
                    case 'R':
                        sides = 4;
                        count++;
                        break;
                    case 'P':
                        if (txt[i].charAt(1) == 'e') {
                            sides = 5;
                            count++;
                        } else {
                            sides = Integer.valueOf(String.valueOf(txt[i].charAt(8)));
                            count++;
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            }
            if (count == menu.cbFiguras.getSelectedIndex() && menu.cbFiguras.getSelectedIndex() != 0) {
                cords(txt, i, sides, buttonCommand);
                i = txt.length;
            }
        }
    }
/*-----------------------------------------------------------------------------*/
    public void cords(String[] txt, int i, int points, String botonOrigen) {
        i = i - (points * 2) - 4;
        int[] y = new int[points];
        int[] x = new int[points];
        int k = 0;
        boolean band = true;
        for (int j = i; j < i + (points * 2); j++) {
            if (band) {
                int a = Integer.valueOf(txt[j]);
                x[k] = a;
                band = false;
            } else {
                int b = Integer.valueOf(txt[j]);
                y[k] = b;
                k++;
                band = true;
            }
        }
        switch (botonOrigen) {
            case "a":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "ab":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "d":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "i":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "r":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "t":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "+r":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "-r":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "+t":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
            case "-t":
                x = moveCords("x", botonOrigen, x, y);
                y = moveCords("y", botonOrigen, x, y);
                break;
        }
        k = 0;
        String iTxt = rTxt(txt, points, i);
        band = true;
        for (int j = i; j < i + (points * 2); j++) {
            if (band) {
                txt[j] = String.valueOf(x[k]);
                band = false;
            } else {
                txt[j] = String.valueOf(y[k]);
                k++;
                band = true;
            }
        }
        String nTxt = rTxt(txt, points, i);
        data = data.replaceAll(iTxt, nTxt);
    }
/*-----------------------------------------------------------------------------*/
    public String rTxt(String[] txt, int puntos, int i) {
        String text = "";
        int k = 0;
        boolean band = true;
        for (int j = i; j < i + (puntos * 2) + 1; j++) {
            if (band && txt[j].length() > 0) {
                text += txt[j] + ",";
                band = false;
            } else {
                text += txt[j] + "\n";
                k++;
                band = true;
            }
            if (txt[j].length() == 0) {
                text += txt[j + 1] + "," + txt[j + 2] + "," + txt[j + 3] + "\n";
                text += txt[j + 4];
            }
        }
        return text;
    }
/*-----------------------------------------------------------------------------*/
    public int[] moveCords(String xoy, String buttonCommand, int[] x, int[] y) {
        int secTX = x[0]-(int) (x[0] * 1.1);
        int secTY = y[0]-(int) (y[0] * 1.1);
        if("x".equals(xoy)){
            switch(buttonCommand){
                case "d":
                    for(int i = 0; i < x.length; i++){
                        x[i] += 10;
                    }
                    break;
                case "i":
                    for(int i = 0; i < x.length; i++){
                        x[i] -= 10;
                    }
                    break;
                case "+r":
                    for(int i = 0; i < x.length; i++){
                        double angle = 5;
                        double radian = x[i] * Math.cos(Math.toRadians(angle));
                        radian -= y[i] * Math.sin(Math.toRadians(angle));
                        x[i] = (int) radian+15;
                    }
                    break;
                case "-r":
                    for(int i = 0; i < x.length; i++){
                        double angle = 355;
                        double radian = x[i] * Math.cos(Math.toRadians(angle));
                        radian -= y[i] * Math.sin(Math.toRadians(angle));
                        x[i] = (int) radian-15;
                    }
                    break;
                case "+t":
                    for(int i = 0; i < x.length; i++){
                        x[i] = (int) (x[i] * 1.1)+secTX;
                    }
                    break;
                case "-t":
                    for(int i = 0; i < x.length; i++){
                        x[i] = (int) (x[i] / 1.1)-secTX;
                    }
                    break;
            }
            return x;
        }else{
            switch(buttonCommand){
                case "a":
                    for(int i = 0; i < x.length; i++){
                        y[i] -= 10;
                    }
                    break;
                case "ab":
                    for(int i = 0; i < x.length; i++){
                        y[i] += 10;
                    }
                    break;
                case "+r":
                    for(int i = 0; i < x.length; i++){
                        double angle = 5;
                        double radian = x[i] * Math.sin(Math.toRadians(angle));
                        radian += y[i] * Math.cos(Math.toRadians(angle));
                        y[i] = (int) radian-15;
                    }
                    break;
                case "-r":
                    for(int i = 0; i < x.length; i++){
                        double angle = 355;
                        double radian = x[i] * Math.sin(Math.toRadians(angle));
                        radian += y[i] * Math.cos(Math.toRadians(angle));
                        y[i] = (int) radian+15;
                    }
                    break;
                case "+t":
                    for(int i = 0; i < x.length; i++){
                        y[i] = (int) (y[i] * 1.1)+secTY;
                    }
                    break;
                case "-t":
                    for(int i = 0; i < x.length; i++){
                        y[i] = (int) (y[i] / 1.1)-secTY;
                    }
                    break;
            }
            return y;
        }
    }
/*-----------------------------------------------------------------------------*/

}
