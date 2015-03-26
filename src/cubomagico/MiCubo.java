package cubomagico;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javafx.scene.input.KeyCode;
import javax.swing.JOptionPane;

public class MiCubo extends javax.swing.JFrame {

    public CuboMagico cm;
    public ValidarCeldas valc = new ValidarCeldas();
    ArrayList<Integer> repetidos = new ArrayList<>();

    public MiCubo(CuboMagico cm) {
        initComponents();
        this.cm = cm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Casilla_1 = new javax.swing.JTextField();
        Casilla_2 = new javax.swing.JTextField();
        Casilla_3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Casilla_4 = new javax.swing.JTextField();
        Casilla_5 = new javax.swing.JTextField();
        Casilla_6 = new javax.swing.JTextField();
        Casilla_7 = new javax.swing.JTextField();
        Casilla_8 = new javax.swing.JTextField();
        Casilla_9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        Casilla_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_1ActionPerformed(evt);
            }
        });
        Casilla_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Casilla_1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_1KeyTyped(evt);
            }
        });

        Casilla_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_2ActionPerformed(evt);
            }
        });
        Casilla_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_2KeyTyped(evt);
            }
        });

        Casilla_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_3KeyTyped(evt);
            }
        });

        jLabel1.setText("Cubo Magico");

        Casilla_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_4KeyTyped(evt);
            }
        });

        Casilla_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_5KeyTyped(evt);
            }
        });

        Casilla_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_6KeyTyped(evt);
            }
        });

        Casilla_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_7KeyTyped(evt);
            }
        });

        Casilla_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Casilla_8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_8KeyTyped(evt);
            }
        });

        Casilla_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Casilla_9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_9KeyTyped(evt);
            }
        });

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Casilla_1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Casilla_4)
                    .addComponent(Casilla_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Casilla_2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Casilla_8)
                    .addComponent(Casilla_5))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Casilla_3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Casilla_9)
                    .addComponent(Casilla_6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Casilla_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Casilla_1ActionPerformed

    private void Casilla_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Casilla_2ActionPerformed

    private void Casilla_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_1KeyTyped

        char tecla = evt.getKeyChar();
        boolean validar;

        if ((tecla <= '9' && tecla >= '1')) {
            validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();
        }


    }//GEN-LAST:event_Casilla_1KeyTyped

    private void Casilla_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_2KeyTyped
        char tecla = evt.getKeyChar();
        boolean validar;
        if ((tecla <= '9' && tecla >= '1')) {
            validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_Casilla_2KeyTyped

    private void Casilla_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_3KeyTyped
        char tecla = evt.getKeyChar();
        if ((tecla <= '9' && tecla >= '1')) {
            boolean validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_Casilla_3KeyTyped

    private void Casilla_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_4KeyTyped
        char tecla = evt.getKeyChar();

        if ((tecla <= '9' && tecla >= '1')) {
            // deja grabar el numero
            boolean validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_Casilla_4KeyTyped

    private void Casilla_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_5KeyTyped
        char tecla = evt.getKeyChar();

        if ((tecla <= '9' && tecla >= '1')) {
            // deja grabar el numero
            boolean validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_Casilla_5KeyTyped

    private void Casilla_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_6KeyTyped
        char tecla = evt.getKeyChar();
        if ((tecla <= '9' && tecla >= '1')) {
            // deja grabar el numero
            boolean validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_Casilla_6KeyTyped

    private void Casilla_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_7KeyTyped
        char tecla = evt.getKeyChar();

        if ((tecla <= '9' && tecla >= '1')) {
            // deja grabar el numero
            boolean validar = repetidos.contains((int) tecla - 48);
            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_Casilla_7KeyTyped

    private void Casilla_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_8KeyTyped
        char tecla = evt.getKeyChar();
///////////////////////////////////////

        /////////////////////////////    
        if ((tecla <= '9' && tecla >= '1')) {
            // deja grabar el numero
            boolean validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_Casilla_8KeyTyped

    private void Casilla_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_9KeyTyped
        char tecla = evt.getKeyChar();

        if ((tecla <= '9' && tecla >= '1')) {
            // deja grabar el numero
            boolean validar = repetidos.contains((int) tecla - 48);

            if (validar == true) {
                JOptionPane.showMessageDialog(this, "numero repetido");
                evt.consume();
            } else {
                repetidos.add(((int) tecla) - 48);
            }
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_Casilla_9KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean fila1 = false, fila2 = false, fila3 = false, col1 = false, col2 = false, col3 = false, diag1 = false, diag2 = false;
        if (!Casilla_1.getText().equals("")
                || !Casilla_2.getText().equals("")
                || !Casilla_3.getText().equals("")
                || !Casilla_4.getText().equals("")
                || !Casilla_5.getText().equals("")
                || !Casilla_6.getText().equals("")
                || !Casilla_7.getText().equals("")
                || !Casilla_8.getText().equals("")
                || !Casilla_9.getText().equals("")) {
            fila1 = valc.sumaMagica(Casilla_1.getText(), Casilla_2.getText(), Casilla_3.getText());
            fila2 = valc.sumaMagica(Casilla_4.getText(), Casilla_5.getText(), Casilla_6.getText());
            fila3 = valc.sumaMagica(Casilla_7.getText(), Casilla_8.getText(), Casilla_9.getText());

            col1 = valc.sumaMagica(Casilla_1.getText(), Casilla_4.getText(), Casilla_7.getText());
            col2 = valc.sumaMagica(Casilla_2.getText(), Casilla_5.getText(), Casilla_8.getText());
            col3 = valc.sumaMagica(Casilla_3.getText(), Casilla_6.getText(), Casilla_9.getText());

            diag1 = valc.sumaMagica(Casilla_1.getText(), Casilla_5.getText(), Casilla_9.getText());
            diag2 = valc.sumaMagica(Casilla_3.getText(), Casilla_5.getText(), Casilla_7.getText());

            if (fila1 == true
                    && fila2 == true
                    && fila3 == true
                    && col1 == true
                    && col2 == true
                    && col3 == true
                    && diag1 == true
                    && diag2 == true) {

                JOptionPane.showMessageDialog(this, "Cuadrado Magico : CORRECTO!");

            } else {
                JOptionPane.showMessageDialog(this, "Cuadrado Magico : INCORRECTO!");
            }
        } else {
            JOptionPane.showMessageDialog(this, " Quedan espacios vacios");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Casilla_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_1KeyReleased


    }//GEN-LAST:event_Casilla_1KeyReleased

    private void Casilla_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_1KeyPressed

valEvento(evt,Casilla_1);

    }//GEN-LAST:event_Casilla_1KeyPressed
 public void valEvento(java.awt.event.KeyEvent evt, javax.swing.JTextField input){
     if (input.getText().length() != 0) {

            if (evt.getKeyCode() == 8) {

                for (int i = 0; i < repetidos.size(); i++) {
                    if (!"".equals(input.getText())&& repetidos.get(i) == Integer.parseInt(input.getText())) {
                        repetidos.remove(i);
                        input.setText("");
                        evt.consume();
                    }
                }
            }
            input.setText("");
            evt.consume();
        }
 }
    private void Casilla_2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_2KeyPressed
valEvento(evt,Casilla_2);
    }//GEN-LAST:event_Casilla_2KeyPressed

    private void Casilla_3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_3KeyPressed
 valEvento(evt,Casilla_3);
    }//GEN-LAST:event_Casilla_3KeyPressed

    private void Casilla_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_4KeyPressed
valEvento(evt,Casilla_4);
    }//GEN-LAST:event_Casilla_4KeyPressed

    private void Casilla_5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_5KeyPressed
valEvento(evt,Casilla_5);
    }//GEN-LAST:event_Casilla_5KeyPressed

    private void Casilla_6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_6KeyPressed
valEvento(evt,Casilla_6);
    }//GEN-LAST:event_Casilla_6KeyPressed

    private void Casilla_7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_7KeyPressed
   valEvento(evt,Casilla_7);
    }//GEN-LAST:event_Casilla_7KeyPressed

    private void Casilla_8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_8KeyPressed
 valEvento(evt,Casilla_8);
    }//GEN-LAST:event_Casilla_8KeyPressed

    private void Casilla_9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_9KeyPressed
 valEvento(evt,Casilla_9);
    }//GEN-LAST:event_Casilla_9KeyPressed

    private void Casilla_8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_8KeyReleased

// TODO add your handling code here:
    }//GEN-LAST:event_Casilla_8KeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
  
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Casilla_1;
    private javax.swing.JTextField Casilla_2;
    private javax.swing.JTextField Casilla_3;
    private javax.swing.JTextField Casilla_4;
    private javax.swing.JTextField Casilla_5;
    private javax.swing.JTextField Casilla_6;
    private javax.swing.JTextField Casilla_7;
    private javax.swing.JTextField Casilla_8;
    private javax.swing.JTextField Casilla_9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
