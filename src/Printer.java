import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Printer {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;

    JFrame windowVar = new JFrame("Variables");
    JFrame windowFun = new JFrame("Funciones");
    JFrame Menu = new JFrame("SEE++");

    public Printer() throws IOException {
        MenuPrincipal();
        Menu.setVisible(true);
        Variables();
        Funciones();
    }

    public void MenuPrincipal() throws IOException{
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        Menu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Menu.setMaximumSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 708, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("NO SE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Funciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Variables");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(Menu.getContentPane());
        Menu.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton2)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton1)
                                .addGap(73, 73, 73)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(91, 91, 91))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.pack();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        windowVar.setVisible(true);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        windowFun.setVisible(true);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {


    }


    public void Variables() throws IOException {

        windowVar.add(new VarPanel());
        windowVar.setSize(1500,600);
        windowVar.setLocationRelativeTo(null);
        windowVar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    public void Funciones(){


        windowFun.add(new FunPanel());
        windowFun.setSize(1500,600);
        windowFun.setLocationRelativeTo(null);
        windowFun.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }



}
