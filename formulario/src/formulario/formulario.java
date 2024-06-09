package formulario;

import javax.swing.*;
import java.awt.*;

public class formulario extends JFrame {

    public formulario() {
        // Configurar el marco principal
        setTitle("All Controls");
        setSize(800, 600); // Se ha aumentado el tamaño del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un GridBagLayout para organizar los componentes
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(layout);

        gbc.insets = new Insets(10, 20, 10, 20); // Se ha aumentado el espacio entre los componentes
        gbc.anchor = GridBagConstraints.WEST;

        // Añadir un botón
        JLabel buttonLabel = new JLabel("Button:");
        JButton button = new JButton("Button");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(buttonLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del botón
        add(button, gbc);

        // Añadir un CheckBox
        JLabel checkBoxLabel = new JLabel("CheckBox:");
        JCheckBox checkBox = new JCheckBox("CheckBox");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(checkBoxLabel, gbc);
        gbc.gridx = 1;
        add(checkBox, gbc);

        // Añadir un Hyperlink (simulado con un JLabel)
        JLabel hyperlinkLabel = new JLabel("Hyperlink:");
        JLabel hyperlink = new JLabel("<html><a href='#'>Hyperlink</a></html>");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(hyperlinkLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(hyperlink, gbc);

        // Añadir un ToggleButton
        JLabel toggleButtonLabel = new JLabel("ToggleButton:");
        JToggleButton toggleButton = new JToggleButton("ToggleButton");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(toggleButtonLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(toggleButton, gbc);

        // Añadir un RadioButton
        JLabel radioButtonLabel = new JLabel("RadioButton:");
        JRadioButton radioButton = new JRadioButton("RadioButton");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(radioButtonLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(radioButton, gbc);

        // Añadir un Label
        JLabel labelLabel = new JLabel("Label:");
        JLabel label = new JLabel("Label");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(labelLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(label, gbc);

        // Añadir un TextField
        JLabel textFieldLabel = new JLabel("TextField:");
        JTextField textField = new JTextField("some text...", 20);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(textFieldLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(textField, gbc);

        // Añadir un PasswordField
        JLabel passwordFieldLabel = new JLabel("PasswordField:");
        JPasswordField passwordField = new JPasswordField("password", 20);
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(passwordFieldLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(passwordField, gbc);

        // Añadir un TextArea
        JLabel textAreaLabel = new JLabel("TextArea:");
        JTextArea textArea = new JTextArea("This is very long text that will wrap to several lines.", 5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(textAreaLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(scrollPane, gbc);

        // Añadir un ProgressIndicator (simulado con JProgressBar)
        JLabel progressIndicatorLabel = new JLabel("ProgressIndicator:");
        JProgressBar progressIndicator = new JProgressBar();
        progressIndicator.setIndeterminate(true);
        JLabel progressIndicatorValue = new JLabel("49%");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(progressIndicatorLabel, gbc);
        gbc.gridx = 1;
        add(progressIndicator, gbc);
        gbc.gridx = 2;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(progressIndicatorValue, gbc);

     // Añadir un ProgressBar
        JLabel progressBarLabel = new JLabel("ProgressBar:");
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(90);
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(progressBarLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(progressBar, gbc);

        // Añadir un Slider
        JLabel sliderLabel = new JLabel("Slider:");
        JSlider slider = new JSlider();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 1; // Se reinicia el ancho del componente
        add(sliderLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Se ha aumentado el ancho del componente
        add(slider, gbc);

        // Mostrar el marco
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(formulario::new);
    }
}
