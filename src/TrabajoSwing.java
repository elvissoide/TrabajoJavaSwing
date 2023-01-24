import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrabajoSwing {

    private JButton buttonAnalisisDatos;
    private JPanel panel;
    private JButton buttonBasesDatos;
    private JButton ButtonPOO;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Trabajo");
        frame.setContentPane(new TrabajoSwing().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(600,250);
        //frame.setSize(400,400);
        frame.setVisible(true);
    }

    public TrabajoSwing() {
        buttonAnalisisDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser("C:\\Users\\elvis\\Desktop\\AnalisisDatos");
                jfc.showOpenDialog(panel);
            }
        });
        buttonAnalisisDatos.setToolTipText("Abrir carpeta de Análisis de Datos");
        buttonBasesDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser("C:\\Users\\elvis\\Desktop\\BasesDatos");
                jfc.showOpenDialog(panel);
            }
        });
        buttonBasesDatos.setToolTipText("Abrir carpeta de Bases de Datos");
        ButtonPOO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser("C:\\Users\\elvis\\Desktop\\POO");
                jfc.showOpenDialog(panel);
            }
        });
        ButtonPOO.setToolTipText("Abrir carpeta de Programación Orientada a Objetos.");
    }
}
