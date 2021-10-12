package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Josue Isai Herrera Benitez.
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        panelContenedor = new javax.swing.JPanel();
        txtVistaPrevia = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JLabel();
        panelControl = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnMasMenos = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDecima = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        txtVistaPrevia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtVistaPrevia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtPantalla.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPantalla.setText("0");

        panelControl.setBackground(new java.awt.Color(255, 255, 255));
        panelControl.setLayout(new java.awt.GridLayout(5, 4));

        btnClear.setBackground(new java.awt.Color(0, 102, 255));
        btnClear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panelControl.add(btnClear);

        btnRaiz.setBackground(new java.awt.Color(0, 102, 255));
        btnRaiz.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(255, 255, 255));
        btnRaiz.setText("√");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        panelControl.add(btnRaiz);

        btnDividir.setBackground(new java.awt.Color(0, 102, 255));
        btnDividir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(255, 255, 255));
        btnDividir.setText("÷");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        panelControl.add(btnDividir);

        btnBorrar.setBackground(new java.awt.Color(0, 102, 255));
        btnBorrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("DELL");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        panelControl.add(btnBorrar);

        btn7.setBackground(new java.awt.Color(0, 102, 255));
        btn7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        panelControl.add(btn7);

        btn8.setBackground(new java.awt.Color(0, 102, 255));
        btn8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        panelControl.add(btn8);

        btn9.setBackground(new java.awt.Color(0, 102, 255));
        btn9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        panelControl.add(btn9);

        btnMultiplicar.setBackground(new java.awt.Color(0, 102, 255));
        btnMultiplicar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("x");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        panelControl.add(btnMultiplicar);

        btn4.setBackground(new java.awt.Color(0, 102, 255));
        btn4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        panelControl.add(btn4);

        btn5.setBackground(new java.awt.Color(0, 102, 255));
        btn5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        panelControl.add(btn5);

        btn6.setBackground(new java.awt.Color(0, 102, 255));
        btn6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        panelControl.add(btn6);

        btnMenos.setBackground(new java.awt.Color(0, 102, 255));
        btnMenos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        panelControl.add(btnMenos);

        btn1.setBackground(new java.awt.Color(0, 102, 255));
        btn1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        panelControl.add(btn1);

        btn2.setBackground(new java.awt.Color(0, 102, 255));
        btn2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        panelControl.add(btn2);

        btn3.setBackground(new java.awt.Color(0, 102, 255));
        btn3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        panelControl.add(btn3);

        btnMas.setBackground(new java.awt.Color(0, 102, 255));
        btnMas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMas.setForeground(new java.awt.Color(255, 255, 255));
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        panelControl.add(btnMas);

        btnMasMenos.setBackground(new java.awt.Color(0, 102, 255));
        btnMasMenos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMasMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMasMenos.setText("±");
        btnMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasMenosActionPerformed(evt);
            }
        });
        panelControl.add(btnMasMenos);

        btn0.setBackground(new java.awt.Color(0, 102, 255));
        btn0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        panelControl.add(btn0);

        btnDecima.setBackground(new java.awt.Color(0, 102, 255));
        btnDecima.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDecima.setForeground(new java.awt.Color(255, 255, 255));
        btnDecima.setText(".");
        btnDecima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimaActionPerformed(evt);
            }
        });
        panelControl.add(btnDecima);

        btnIgual.setBackground(new java.awt.Color(0, 102, 255));
        btnIgual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        panelControl.add(btnIgual);

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVistaPrevia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Usos");
        barraMenu.add(jMenu1);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        escribirEnPantalla("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDecimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimaActionPerformed
        // TODO add your handling code here:
        if (!existeDecimal()) {
            escribirEnPantalla(".");
        }
    }//GEN-LAST:event_btnDecimaActionPerformed

    private void btnMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasMenosActionPerformed
        // TODO add your handling code here:
        double actual = Double.parseDouble(txtPantalla.getText());
        if (actual != 0) {
            actual = actual * -1;
            txtPantalla.setText(String.valueOf(actual));
        }
    }//GEN-LAST:event_btnMasMenosActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText("0");
        operacion = 0;
        numeroEnPantalla = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        // TODO add your handling code here:
        operacion = 1;
        obtenerTextoEnPantalla();
        txtVistaPrevia.setText("sqrt(" + numeroEnPantalla + ")");
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
        operacion = 2;
        obtenerTextoEnPantalla();
        txtVistaPrevia.setText(numeroEnPantalla + "÷");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        String actual = txtPantalla.getText();
        if (actual.length()>0 && !actual.equals("0")) {
            txtPantalla.setText(actual.substring(0, actual.length()-1));
        }else{
            txtPantalla.setText("0");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        operacion = 3;
        obtenerTextoEnPantalla();
        txtVistaPrevia.setText(numeroEnPantalla + "x");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        operacion = 4;
        obtenerTextoEnPantalla();
        txtVistaPrevia.setText(numeroEnPantalla + "-");
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
        operacion = 5;
        obtenerTextoEnPantalla();
        txtVistaPrevia.setText(numeroEnPantalla + "+");
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        double resultado = 0;
        try {
            double actual = Double.parseDouble(txtPantalla.getText());
            double anterior = numeroEnPantalla;

            switch (operacion) {
                case 1:
                    resultado = Math.sqrt(anterior);
                    break;
                case 2: 
                    resultado = anterior / actual;
                    break;
                case 3:
                    resultado = anterior * actual;
                    break;
                case 4:
                    resultado = anterior - actual;
                    break;
                case 5:
                    resultado = anterior + actual;
                    break;
                default:
                    if (anterior != 0) {
                        resultado = anterior;
                    } else if (actual != 0) {
                        resultado = actual;
                    } else {
                        resultado = 0;
                    }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Math Error", "Error", JOptionPane.WARNING_MESSAGE);
            resultado = 0;
        }
        operacion = 0;
        numeroEnPantalla = 0;
        txtVistaPrevia.setText(null);
        txtPantalla.setText(String.format("%.2f", resultado));
    }//GEN-LAST:event_btnIgualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    private void escribirEnPantalla(String btnPresionado) {
        if (txtPantalla.getText().equals("0")) {
            txtPantalla.setText(String.valueOf(btnPresionado));
        } else {
            String actual = txtPantalla.getText();
            txtPantalla.setText(actual + btnPresionado);
        }
    }

    private void obtenerTextoEnPantalla() {
        try {
            numeroEnPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("0");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Math Error", "Error", JOptionPane.WARNING_MESSAGE);
            txtPantalla.setText("0");
        }
    }
    
    private boolean existeDecimal(){
        char[] digitos = txtPantalla.getText().toCharArray();
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i]=='.') {
                return true;
            }
        }
        return false;
    }

    private double numeroEnPantalla;
    private int operacion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecima;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMasMenos;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelControl;
    private javax.swing.JLabel txtPantalla;
    private javax.swing.JLabel txtVistaPrevia;
    // End of variables declaration//GEN-END:variables
}
