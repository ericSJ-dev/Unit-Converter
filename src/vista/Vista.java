package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Esta aplicación usa una interfaz visual para convertir unidades de longitud.
//permite convertir entre centimetros, pulgadas, pies, metros, kilometros y millas
//Esta clase crea la ventana principal de la aplicación y agrega el panel de conversión de longitud llamado LenghtFrame.
public class Vista extends JFrame {
    private JPanel LengthFrame;

    // Constructor de la clase Vista
    public Vista() {
        // Configuración básica de la ventana
        setSize(600, 250);
        setTitle("Conversor de unidades");
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creación y configuración del panel para convertir las unidades
        LengthFrame = new LengthFrame();
        LengthFrame.setBounds(20, 20, 540, 170);
        add(LengthFrame);
    }

    public static void main(String args[]) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
