package Vista;

import Modelo.Pizarron;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author pozos
 */

public class Menu extends javax.swing.JFrame {
    

    public Menu() {
        initComponents();
    }

    public void addEventos() {
        spR.setVisible(false);
        spG.setVisible(false);
        spB.setVisible(false);
        spLado.setVisible(false);
        pnColor.setVisible(false);
        lbContador.setVisible(false);
        
        Pizarron blackboard;
        blackboard = new Pizarron(this) {
        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            //frame.pnColor.setBackground(new Color((Integer) frame.spR.getValue(), (Integer) frame.spG.getValue(), (Integer) frame.spB.getValue()));
        }
        };
        miAbrir.addActionListener(blackboard);
        miNuevo.addActionListener(blackboard);
        miGuardar.addActionListener(blackboard);
        bgFiguras.add(rbLinea);
        bgFiguras.add(rbTriangulo);
        bgFiguras.add(rbRectangulo);
        bgFiguras.add(rbPentagono);
        
        panelPrincipal.addMouseListener(blackboard);
        spLado.addChangeListener(blackboard);
        spR.addChangeListener(blackboard);
        spG.addChangeListener(blackboard);
        spB.addChangeListener(blackboard);
        btMasRotar.addActionListener(blackboard);
        btMenosRotar.addActionListener(blackboard);
        btMasTamanio.addActionListener(blackboard);
        btMenosTamanio.addActionListener(blackboard);
        btMovimientoArriba.addActionListener(blackboard);
        btMovimientoAbajo.addActionListener(blackboard);
        btMovimientoDerecha.addActionListener(blackboard);
        btMovimientoIzquierda.addActionListener(blackboard);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiguras = new javax.swing.ButtonGroup();
        lbContador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnColor = new javax.swing.JPanel();
        spB = new javax.swing.JSpinner();
        spLado = new javax.swing.JSpinner();
        spG = new javax.swing.JSpinner();
        spR = new javax.swing.JSpinner();
        panelPrincipal = new Vista.Pizarron();
        jPanel2 = new javax.swing.JPanel();
        rbLinea = new javax.swing.JToggleButton();
        rbTriangulo = new javax.swing.JToggleButton();
        rbRectangulo = new javax.swing.JToggleButton();
        rbPentagono = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbFiguras = new javax.swing.JComboBox<>();
        btMasRotar = new javax.swing.JButton();
        btMenosRotar = new javax.swing.JButton();
        btMasTamanio = new javax.swing.JButton();
        btMenosTamanio = new javax.swing.JButton();
        btMovimientoDerecha = new javax.swing.JButton();
        btMovimientoArriba = new javax.swing.JButton();
        btMovimientoAbajo = new javax.swing.JButton();
        btMovimientoIzquierda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lbContador.setText("Puntos: 0");
        getContentPane().add(lbContador);
        lbContador.setBounds(850, 410, 60, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 480, 0, 0);

        pnColor.setBackground(new java.awt.Color(25, 57, 106));

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(pnColor);
        pnColor.setBounds(90, 420, 20, 20);

        spB.setModel(new javax.swing.SpinnerNumberModel(106, 0, 255, 1));
        getContentPane().add(spB);
        spB.setBounds(50, 420, 20, 22);

        spLado.setModel(new javax.swing.SpinnerNumberModel(2, 2, 9, 1));
        getContentPane().add(spLado);
        spLado.setBounds(70, 420, 20, 22);

        spG.setModel(new javax.swing.SpinnerNumberModel(57, 0, 255, 1));
        getContentPane().add(spG);
        spG.setBounds(30, 420, 20, 22);

        spR.setModel(new javax.swing.SpinnerNumberModel(25, 0, 255, 1));
        spR.setValue(255);
        getContentPane().add(spR);
        spR.setBounds(10, 420, 20, 22);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(160, 20, 640, 420);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbLinea.setText("Linea");

        rbTriangulo.setText("Triangulo");

        rbRectangulo.setText("Rectangulo");

        rbPentagono.setText("Pentagono");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rbLinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPentagono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(rbTriangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbRectangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbLinea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPentagono)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 20, 140, 150);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Transformaciones:");

        cbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Figura..." }));
        cbFiguras.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(cbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(810, 20, 140, 180);

        btMasRotar.setText("Rotar +");
        btMasRotar.setActionCommand("+r");
        btMasRotar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btMasRotarKeyPressed(evt);
            }
        });
        getContentPane().add(btMasRotar);
        btMasRotar.setBounds(840, 230, 80, 22);

        btMenosRotar.setText("Rotar -");
        btMenosRotar.setActionCommand("-r");
        getContentPane().add(btMenosRotar);
        btMenosRotar.setBounds(840, 250, 80, 22);

        btMasTamanio.setText("Escalar +");
        btMasTamanio.setActionCommand("+t");
        getContentPane().add(btMasTamanio);
        btMasTamanio.setBounds(840, 300, 80, 22);

        btMenosTamanio.setText("Escalar -");
        btMenosTamanio.setActionCommand("-t");
        getContentPane().add(btMenosTamanio);
        btMenosTamanio.setBounds(840, 320, 80, 22);

        btMovimientoDerecha.setText("Derecha");
        btMovimientoDerecha.setActionCommand("d");
        getContentPane().add(btMovimientoDerecha);
        btMovimientoDerecha.setBounds(30, 320, 80, 22);

        btMovimientoArriba.setText("Arriba");
        btMovimientoArriba.setActionCommand("a");
        getContentPane().add(btMovimientoArriba);
        btMovimientoArriba.setBounds(30, 230, 80, 22);

        btMovimientoAbajo.setText("Abajo");
        btMovimientoAbajo.setActionCommand("ab");
        getContentPane().add(btMovimientoAbajo);
        btMovimientoAbajo.setBounds(30, 250, 80, 22);

        btMovimientoIzquierda.setText("Izquierda");
        btMovimientoIzquierda.setActionCommand("i");
        getContentPane().add(btMovimientoIzquierda);
        btMovimientoIzquierda.setBounds(30, 300, 80, 22);

        jMenu1.setText("Archivo");

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miNuevo.setText("Nuevo");
        jMenu1.add(miNuevo);
        jMenu1.add(jSeparator1);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAbrir.setText("Abrir");
        jMenu1.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miGuardar.setText("Guardar");
        jMenu1.add(miGuardar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMasRotarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btMasRotarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMasRotarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup bgFiguras;
    private javax.swing.JButton btMasRotar;
    private javax.swing.JButton btMasTamanio;
    private javax.swing.JButton btMenosRotar;
    private javax.swing.JButton btMenosTamanio;
    private javax.swing.JButton btMovimientoAbajo;
    private javax.swing.JButton btMovimientoArriba;
    private javax.swing.JButton btMovimientoDerecha;
    private javax.swing.JButton btMovimientoIzquierda;
    public javax.swing.JComboBox<String> cbFiguras;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JLabel lbContador;
    public javax.swing.JMenuItem miAbrir;
    public javax.swing.JMenuItem miGuardar;
    public javax.swing.JMenuItem miNuevo;
    public Vista.Pizarron panelPrincipal;
    public javax.swing.JPanel pnColor;
    public javax.swing.JToggleButton rbLinea;
    public javax.swing.JToggleButton rbPentagono;
    public javax.swing.JToggleButton rbRectangulo;
    public javax.swing.JToggleButton rbTriangulo;
    public javax.swing.JSpinner spB;
    public javax.swing.JSpinner spG;
    public javax.swing.JSpinner spLado;
    public javax.swing.JSpinner spR;
    // End of variables declaration//GEN-END:variables
}
