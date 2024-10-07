import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejadorFrame {
    static JFrame jFrameManejadores;
    static JLabel txtLabelX, txtLabelY, txtLabelResult;
    static JTextField txtFieldX, txtFieldY, txtFieldResult;
    static JButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnRaizX, btnRaizY, btnXaLaY, btnYaLaX, btnXModY;
    static int x, y;
    static JPanel panel = new JPanel(new GridLayout(5, 3, 5, 5));

    public static void main(String[] args) {
        inicializarJframeManejador();
        instanciarComponentes();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        agregrarComponentesAlPanel();
        jFrameManejadores.add(panel);
        jFrameManejadores.setVisible(true);
        sumar();
    }

    private static int obtenerX() {
        return Integer.parseInt(txtFieldX.getText());
    }

    private static int obtenerY() {
        return Integer.parseInt(txtFieldY.getText());
    }

    private static void sumar() {
        btnSumar.addActionListener(e -> {
            x = obtenerX();
            y = obtenerY();
            int result = x + y;
            txtFieldResult.setText(String.valueOf(result));
        });
    }

    private static void agregrarComponentesAlPanel() {
        panel.add(txtLabelX);
        panel.add(txtLabelY);
        panel.add(txtLabelResult);
        panel.add(txtFieldX);
        panel.add(txtFieldY);
        panel.add(txtFieldResult);
        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(btnMultiplicar);
        panel.add(btnDividir);
        panel.add(btnRaizX);
        panel.add(btnRaizY);
        panel.add(btnXaLaY);
        panel.add(btnYaLaX);
        panel.add(btnXModY);
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
