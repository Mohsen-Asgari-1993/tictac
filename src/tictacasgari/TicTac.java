package tictacasgari;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class TicTac extends javax.swing.JFrame {

    private static boolean state = true;
    private static int count = 0;
    private static Map<JButton, String> map = new HashMap<>();

    /**
     * Creates new form TicTac
     */
    public TicTac() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jB2 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB1)) {
                if (state) {
                    state = !state;
                    jB1.setText("X");
                    map.put(jB1, "X");
                    count++;
                    showMessage(count);

                } else {
                    state = !state;
                    jB1.setText("O");
                    map.put(jB1, "O");
                    count++;
                    showMessage(count);

                }
            }
        }
    }

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB2)) {
                if (state) {
                    state = !state;
                    jB2.setText("X");
                    map.put(jB2, "X");
                    count++;
                    showMessage(count);

                } else {
                    state = !state;
                    jB2.setText("O");
                    map.put(jB2, "O");
                    count++;
                    showMessage(count);

                }
            }
        }
    }

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB3)) {
                if (state) {
                    state = !state;
                    jB3.setText("X");
                    map.put(jB3, "X");
                    count++;
                    showMessage(count);

                } else {
                    state = !state;
                    jB3.setText("O");
                    map.put(jB3, "O");
                    count++;
                    showMessage(count);

                }
            }
        }

    }

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB4)) {
                if (state) {
                    state = !state;
                    jB4.setText("X");
                    map.put(jB4, "X");
                    count++;
                    showMessage(count);

                } else {
                    state = !state;
                    jB4.setText("O");
                    map.put(jB4, "O");
                    count++;
                    showMessage(count);

                }
            }
        }

    }

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB5)) {
                if (state) {
                    state = !state;
                    jB5.setText("X");
                    map.put(jB5, "X");
                    count++;
                    showMessage(count);

                } else {
                    state = !state;
                    jB5.setText("O");
                    map.put(jB5, "O");
                    count++;
                    showMessage(count);


                }
            }
        }
    }

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB6)) {

                if (state) {
                    state = !state;
                    jB6.setText("X");
                    map.put(jB6, "X");
                    count++;
                    showMessage(count);


                } else {
                    state = !state;
                    jB6.setText("O");
                    map.put(jB6, "O");
                    count++;
                    showMessage(count);


                }
            }
        }

    }

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB7)) {
                if (state) {
                    state = !state;
                    jB7.setText("X");
                    map.put(jB7, "X");
                    count++;
                    showMessage(count);
                } else {
                    state = !state;
                    jB7.setText("O");
                    map.put(jB7, "O");
                    count++;
                    showMessage(count);
                }

            }
        }


    }

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB8)) {

                if (state) {
                    state = !state;
                    jB8.setText("X");
                    map.put(jB8, "X");
                    count++;
                    showMessage(count);

                } else {
                    state = !state;
                    jB8.setText("O");
                    map.put(jB8, "O");
                    count++;
                    showMessage(count);

                }
            }
        }

    }

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (count == 9) {
            showMessage();
        } else {
            if (!map.containsKey(jB9)) {

                if (state) {
                    state = !state;
                    jB9.setText("X");
                    map.put(jB9, "X");
                    count++;
                    showMessage(count);
                } else {
                    state = !state;
                    jB9.setText("O");
                    map.put(jB9, "O");
                    count++;
                    showMessage(count);
                }
            }
        }

    }

    private static void showMessage() {
        JOptionPane.showMessageDialog(null, "Game Over", "The End", TrayIcon.MessageType.ERROR.ordinal());
    }

    private static void showMessage(int count) {
        if (count == 9)
            JOptionPane.showMessageDialog(null, "Game Over", "The End", TrayIcon.MessageType.ERROR.ordinal());
    }


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
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    // End of variables declaration
}




