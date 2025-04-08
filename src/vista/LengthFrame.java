package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import controlador.Controlador;

//Esta clase crea el panel principal donde se realiza la conversión de unidades.

public class LengthFrame extends JPanel implements ActionListener {
    Controlador c = new Controlador();

    // arreglos para crear la lista desplegable de las unidades
    String[] unidades = { "Unidad a convertir", "centimetros", "pulgadas", "pies", "metros", "kilometros", "millas" };
    String[] unidadesResultado = { "Unidad para el resultado", "centimetros", "pulgadas", "pies", "metros", "kilometros", "millas" };

    // Campos de texto para la conversión
    private JTextField unidad;
    private JTextField unidadResultado;

    // listas desplegables para seleccionar la unidad a convertir o la unidad de
    // resultado
    private JComboBox<String> listaUnidades;
    private JComboBox<String> listaUnidadesResultado;

    // Boton de conversión
    private JButton convertir;

    // Constructor de la clase Centimetros
    public LengthFrame() {
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder(""));

        // Creación y configuración de los elementos de la interfaz

        // creación de lista deplegable para seleccionar la unidad a convertir
        listaUnidades = new JComboBox<>(unidades);
        listaUnidades.setBounds(40, 10, 200, 30);
        listaUnidades.setSelectedItem(0);
        listaUnidades.setEditable(false);
        add(listaUnidades);

        // campo de texto de la unidad del usuario a convertir
        unidad = new JTextField();
        unidad.setBounds(40, 50, 200, 40);
        add(unidad);

        // Creación de lista desplegable para seleccionar la unidad de resultado
        listaUnidadesResultado = new JComboBox<>(unidadesResultado);
        listaUnidadesResultado.setBounds(300, 10, 200, 30);
        listaUnidadesResultado.setSelectedItem(0);
        listaUnidadesResultado.setEditable(false);
        add(listaUnidadesResultado);

        // campo del resultado
        unidadResultado = new JTextField();
        unidadResultado.setBounds(300, 50, 200, 40);
        unidadResultado.setEditable(false);
        add(unidadResultado);

        // Creación y configuración del botón de conversión
        convertir = new JButton("Convertir");
        convertir.setBounds(200, 110, 140, 40);
        convertir.addActionListener(this);
        add(convertir);
    }

    // Manejo del evento de acción del boton
    public void actionPerformed(ActionEvent f) {

        //texto para la entrada del usuario
        String textoUnidad = unidad.getText().trim();

        // validación de los campos de las listas desplegables
        if (listaUnidades.getSelectedIndex() == 0 || listaUnidadesResultado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona unidades válidas.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        //validaciones del campo de texto de la unidad a convertir

        //el campo no esté vacio
        if(textoUnidad.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un valor a convertir.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        //el campo no contenga caracteres no válidos
        if (!textoUnidad.matches("^(0|[1-9]\\d*)(\\.\\d+)?$")) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el número a convertir
        double num = Double.parseDouble(textoUnidad);

        // Obtener las unidades seleccionadas
        String unidadOrigen = (String) listaUnidades.getSelectedItem();
        String unidadDestino = (String) listaUnidadesResultado.getSelectedItem();

        // acción del botón de conversión
        
        try {
            //realiza la conversion y pone el resultado en la interfaz
            double resultado = c.convertir(num, unidadOrigen, unidadDestino);
            unidadResultado.setText(String.format("%.6f",resultado));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: el número ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error: No se pudo obtener las unidades seleccionadas.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la conversión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
