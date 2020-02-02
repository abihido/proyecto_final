import javax.swing.*;
import java.io.IOException;

public class Printer {





    public void Variables() throws IOException {
        JFrame windowVar = new JFrame("Variables");
        windowVar.add(new VarPanel());
        windowVar.setSize(1500,600);
        windowVar.setLocationRelativeTo(null);
        windowVar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowVar.setVisible(true);
    }

    public void Funciones(){

        JFrame windowFun = new JFrame("Funciones");
        windowFun.add(new FunPanel());
        windowFun.setSize(1500,600);
        windowFun.setLocationRelativeTo(null);
        windowFun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFun.setVisible(true);

    }



}
