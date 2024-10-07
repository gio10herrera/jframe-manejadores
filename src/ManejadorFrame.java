import javax.swing.*;
import java.awt.*;

public class ManejadorFrame {
    static JFrame jFrameManejadores;
    static JLabel txtLabelX, txtLabelY, txtLabelResult;
    static JTextField txtFieldX, txtFieldY, txtFieldResult;
    static JButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnRaizX, btnRaizY, btnXaLaY, btnYaLaX, btnXModY;

    public static void main(String[] args) {
        inicializarJframeManejador();
        instanciarComponentes();
        jFrameManejadores.setLayout(new GridLayout(5, 3, 5, 5));
        agregrarComponentesAlFrame();
        jFrameManejadores.setVisible(true);
    }

    private static void agregrarComponentesAlFrame() {
        jFrameManejadores.add(txtLabelX);
        jFrameManejadores.add(txtLabelY);
        jFrameManejadores.add(txtLabelResult);
        jFrameManejadores.add(txtFieldX);
        jFrameManejadores.add(txtFieldY);
        jFrameManejadores.add(txtFieldResult);
        jFrameManejadores.add(btnSumar);
        jFrameManejadores.add(btnRestar);
        jFrameManejadores.add(btnMultiplicar);
        jFrameManejadores.add(btnDividir);
        jFrameManejadores.add(btnRaizX);
        jFrameManejadores.add(btnRaizY);
        jFrameManejadores.add(btnXaLaY);
        jFrameManejadores.add(btnYaLaX);
        jFrameManejadores.add(btnXModY);
    }

    private static void instanciarComponentes() {
        txtLabelX = new JLabel("X");
        txtLabelY = new JLabel("Y");
        txtLabelResult = new JLabel("Resultado");
        txtFieldX = new JTextField();
        txtFieldY = new JTextField();
        txtFieldResult = new JTextField();
        txtFieldResult.setEditable(false);
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnRaizX = new JButton("Raiz X");
        btnRaizY = new JButton("Raiz Y");
        btnXaLaY = new JButton("X a la Y");
        btnYaLaX = new JButton("Y a la X");
        btnXModY = new JButton("X mod Y");
    }

    private static void inicializarJframeManejador() {
        //creacion del JFrame
        jFrameManejadores = new JFrame();
        jFrameManejadores.setSize(400, 400);
        //jFrameInterfaz.pack();
        jFrameManejadores.setLocationRelativeTo(null);
        jFrameManejadores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameManejadores.setResizable(false);
        jFrameManejadores.setTitle("Actividad con JFrame Manejadores");
    }
}
