import javafx.scene.chart.XYChart;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Printer {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public Descritor jPanel1 = new Descritor();

    private volatile boolean OK =false;
    void Esperalo() {

        while (!OK){

        }

        OK=false;

    }



    JFrame windowVar = new JFrame("Variables");
    VarPanel PanelVariables = new VarPanel();


    JFrame windowFun = new JFrame("Funciones");
    FunPanel PanelFunciones = new FunPanel();

    JFrame Menu = new JFrame("SEE++");



    public Variable[] GetLocalVariables(){
        return PanelVariables.Local;
    }

    public Variable[] GetGlobalVariables(){
        return PanelVariables.Global;
    }

    public void addVarGlobal(String identifier,String variable,boolean vector,String t){
        PanelVariables.addVarG(identifier,variable,vector,t);
    }

    public void addVarLocal(String identifier,String variable,boolean vector,String t){
        PanelVariables.addVarL(identifier,variable,vector,t);
    }

    public void addFunction(String name, String tipo, ArrayList types, ArrayList argNames, String s){
        PanelFunciones.addFuncion(name,tipo,types,argNames,s);
    }

    public void modifyVar(String name, String valor){
        PanelVariables.modVariable(name,valor);
    }

    public Printer() throws IOException {
        MenuPrincipal();
        Menu.setVisible(true);
        Variables();
        Funciones();
    }

    public void MenuPrincipal() throws IOException{
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

        jButton1.setText("SIGUIENTE PASO");
        jButton1.setFont(new Font("Arial",Font.BOLD,20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Funciones");
        jButton2.setFont(new Font("Arial",Font.BOLD,20));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Variables");
        jButton3.setFont(new Font("Arial",Font.BOLD,20));
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

        Menu.setLocationRelativeTo(null);
        Menu.setResizable(false);
        Menu.pack();
        jPanel1.setBackground(Color.WHITE);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        windowVar.setVisible(true);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        windowFun.setVisible(true);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        OK=true;
    }


    public void Variables() throws IOException {
        windowVar.add(PanelVariables);
        windowVar.setSize(1500,600);
        windowVar.setLocationRelativeTo(null);
        windowVar.setResizable(false);
        windowVar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    public void Funciones(){
        windowFun.add(PanelFunciones);
        windowFun.setSize(1500,600);
        windowFun.setLocationRelativeTo(null);
        windowFun.setResizable(false);
        windowFun.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

}

class Descritor extends JPanel {
    BufferedImage bg_menu;

    {
        try {
            bg_menu = ImageIO.read(new File("input/bg_menu.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String Instruccion,Nombre1;
    int option;
    int Linea;
    public Descritor(){

    }
    void setOption(int i ,String nombre1, int linea){
        option=i;
        Nombre1=nombre1;
        Linea=linea;
        updateUI();
    }
    void CreateFunction(Graphics g){
        Instruccion="EN LA LINEA "+Linea+" SE CREA LA FUNCION";
    }
    void CreateVariable(Graphics g){
        Instruccion="EN LA LINEA "+Linea+" SE CREA LA VARIABLE";
    }
    void CreateVariables(Graphics g){
        Instruccion="EN LA LINEA "+Linea+" SE CREAN LAS VARIABLES";
    }
    void CreateAndAssing(Graphics g){
        Instruccion="EN LA LINEA "+Linea+" SE CREA LA VARIABLE";
    }
    void Assing(Graphics g){
        Instruccion="EN LA LINEA "+Linea+" SE LE ASIGNA A LA VARIABLE";
    }
    void EnterToMain(Graphics g){
        Instruccion="EN LA LINEA "+Linea+" ENTRAMOS AL MAIN";
    }
    void Conditional(Graphics g){Instruccion="REALIZAMOS UNA COMPARACION";}
    void Final(Graphics g){Instruccion="Y ACABAMOS...";}
    void Bienvenidos(Graphics g){
        Instruccion="";
        int x= (getWidth()-"BIENVENIDOS".length()*20)/2 ;

        g.setFont(new Font("Times New Roman",Font.BOLD,60));
        g.drawString("BIENVENIDOS",x,200);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg_menu,0,0,getWidth(),getHeight(),this);

        switch (option){
            case 0: Bienvenidos(g); break;
            case 1: CreateFunction(g); break;
            case 2: CreateVariable(g); break;
            case 3: CreateVariables(g); break;
            case 4: CreateAndAssing(g); break;
            case 5: Assing(g);break;
            case 6: EnterToMain(g);break;
            case 7:Conditional(g);break;
            case 8:Final(g);break;
        }
        g.setFont(new Font("Arial",Font.BOLD,25));
        g.setColor(Color.black);
        int x= (getWidth()-(Instruccion.length())*15)/2 ;
        g.drawString(Instruccion,x,200);
        g.setFont(new Font("Arial",Font.BOLD,15));
        try {
            x = (getWidth() - (Nombre1.length())*10) / 2;
            g.drawString(Nombre1, x, 250);
        }
        catch (Exception ex){

        }
    }
}