import javax.swing.*;

public class ManejadorFrame {
    static JFrame jFrameManejadores;
    static JLabel txtLabelX, txtLabelY, txtLabelResult;
    static JTextField txtFieldX, txtFieldY, txtFieldResult;
    static JButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnRaizX, btnRaizY, btnXaLaY, btnYaLaX, btnXModY;

    public static void main(String[] args) {
        inicializarJframeManejador();
        jFrameManejadores.setVisible(true);
        instanciarComponentes();
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
