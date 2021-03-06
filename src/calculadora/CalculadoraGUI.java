/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import logica.Operaciones;

/**
 *
 * @author Estudiantes
 */
public class CalculadoraGUI extends javax.swing.JFrame {
    Operaciones op = new Operaciones();
    
    int numero1;
    int numero2;
    int resultado;
    /**
     * Creates new form CalculadoraGUI
     */
    public CalculadoraGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pantalla = new javax.swing.JTextField();
        NUM4 = new javax.swing.JLabel();
        NUM7 = new javax.swing.JLabel();
        NUM1 = new javax.swing.JLabel();
        NUM5 = new javax.swing.JLabel();
        NUM8 = new javax.swing.JLabel();
        NUM2 = new javax.swing.JLabel();
        NUM6 = new javax.swing.JLabel();
        NUM9 = new javax.swing.JLabel();
        NUM3 = new javax.swing.JLabel();
        divicion = new javax.swing.JLabel();
        NUM10 = new javax.swing.JLabel();
        igual = new javax.swing.JLabel();
        suma = new javax.swing.JLabel();
        resta = new javax.swing.JLabel();
        multiplicacion = new javax.swing.JLabel();
        NUM15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        NUM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM4.setText("4");
        NUM4.setBorder(new javax.swing.border.MatteBorder(null));
        NUM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM4MouseClicked(evt);
            }
        });

        NUM7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM7.setText("7");
        NUM7.setBorder(new javax.swing.border.MatteBorder(null));
        NUM7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM7MouseClicked(evt);
            }
        });

        NUM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM1.setText("1");
        NUM1.setBorder(new javax.swing.border.MatteBorder(null));
        NUM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM1MouseClicked(evt);
            }
        });

        NUM5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM5.setText("5");
        NUM5.setBorder(new javax.swing.border.MatteBorder(null));
        NUM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM5MouseClicked(evt);
            }
        });

        NUM8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM8.setText("8");
        NUM8.setBorder(new javax.swing.border.MatteBorder(null));
        NUM8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM8MouseClicked(evt);
            }
        });

        NUM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM2.setText("2");
        NUM2.setBorder(new javax.swing.border.MatteBorder(null));
        NUM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM2MouseClicked(evt);
            }
        });

        NUM6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM6.setText("6");
        NUM6.setBorder(new javax.swing.border.MatteBorder(null));
        NUM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM6MouseClicked(evt);
            }
        });

        NUM9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM9.setText("9");
        NUM9.setBorder(new javax.swing.border.MatteBorder(null));
        NUM9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM9MouseClicked(evt);
            }
        });

        NUM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM3.setText("3");
        NUM3.setBorder(new javax.swing.border.MatteBorder(null));
        NUM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM3MouseClicked(evt);
            }
        });

        divicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        divicion.setText("÷");
        divicion.setBorder(new javax.swing.border.MatteBorder(null));
        divicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divicionMouseClicked(evt);
            }
        });

        NUM10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM10.setText("0");
        NUM10.setBorder(new javax.swing.border.MatteBorder(null));
        NUM10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM10MouseClicked(evt);
            }
        });

        igual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        igual.setText("=");
        igual.setBorder(new javax.swing.border.MatteBorder(null));
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });

        suma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suma.setText("+");
        suma.setBorder(new javax.swing.border.MatteBorder(null));
        suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumaMouseClicked(evt);
            }
        });
        suma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sumaKeyPressed(evt);
            }
        });

        resta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resta.setText("-");
        resta.setBorder(new javax.swing.border.MatteBorder(null));
        resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaMouseClicked(evt);
            }
        });

        multiplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        multiplicacion.setText("×");
        multiplicacion.setBorder(new javax.swing.border.MatteBorder(null));
        multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicacionMouseClicked(evt);
            }
        });

        NUM15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUM15.setText("CE");
        NUM15.setBorder(new javax.swing.border.MatteBorder(null));
        NUM15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUM15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NUM4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(NUM5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(NUM6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NUM15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NUM10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NUM1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(NUM2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(NUM3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divicion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pantalla, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(NUM7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(NUM8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(NUM9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NUM7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUM8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NUM9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NUM4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NUM5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NUM6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NUM1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUM2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NUM3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(divicion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUM10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUM15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaActionPerformed

    private void divicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divicionMouseClicked
       pantalla.setText(pantalla.getText()+"0");
    }//GEN-LAST:event_divicionMouseClicked

    private void NUM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM1MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"1");
    }//GEN-LAST:event_NUM1MouseClicked

    private void NUM2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM2MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"2");
    }//GEN-LAST:event_NUM2MouseClicked

    private void NUM3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM3MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_NUM3MouseClicked

    private void NUM4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM4MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_NUM4MouseClicked

    private void NUM5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM5MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_NUM5MouseClicked

    private void NUM6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM6MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_NUM6MouseClicked

    private void NUM7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM7MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_NUM7MouseClicked

    private void NUM8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM8MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_NUM8MouseClicked

    private void NUM9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM9MouseClicked
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_NUM9MouseClicked

    private void NUM10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NUM10MouseClicked

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
        // TODO add your handling code here:
        numero2 = Integer.parseInt(pantalla.getText());
        pantalla.setText(pantalla.getText()+"=");
        resultado = numero1 + numero2;
        pantalla.setText("");
        pantalla.setText(String.valueOf(resultado));
        
    }//GEN-LAST:event_igualMouseClicked

    private void sumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumaMouseClicked
        // TODO add your handling code here:
        numero1 = Integer.parseInt(pantalla.getText());
        pantalla.setText(pantalla.getText()+"+");
        pantalla.setText("");
        
        
         
    }//GEN-LAST:event_sumaMouseClicked

    private void restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_restaMouseClicked

    private void multiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplicacionMouseClicked

    private void NUM15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUM15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NUM15MouseClicked

    private void sumaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sumaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumaKeyPressed

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
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NUM1;
    private javax.swing.JLabel NUM10;
    private javax.swing.JLabel NUM15;
    private javax.swing.JLabel NUM2;
    private javax.swing.JLabel NUM3;
    private javax.swing.JLabel NUM4;
    private javax.swing.JLabel NUM5;
    private javax.swing.JLabel NUM6;
    private javax.swing.JLabel NUM7;
    private javax.swing.JLabel NUM8;
    private javax.swing.JLabel NUM9;
    private javax.swing.JLabel divicion;
    private javax.swing.JLabel igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel multiplicacion;
    private javax.swing.JTextField pantalla;
    private javax.swing.JLabel resta;
    private javax.swing.JLabel suma;
    // End of variables declaration//GEN-END:variables
}
