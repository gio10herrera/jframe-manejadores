import javax.swing.*;

public class ManejadorFrame {
    static JFrame jFrameManejadores;
    static JLabel txtLabelX, txtLabelY, txtLabelResult;
    static JTextField txtFieldX, txtFieldY, txtFieldResult;
    static JButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnRaizX, btnRaizY, btnXaLaY, btnYaLaX, btnXModY;
    
    public static void main(String[] args) {
        inicializarJframeManejador();
        jFrameManejadores.setVisible(true);
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
